$(function(){
    init();
    
})

//初始化表格 以及翻页框  
function init(){
    $("#spend").datagrid({
    //    url:'findall.do?name=1',
        rownumbers:true,
        pagination:true,
        singleSelect:true,
        method:'post',
        toolbar:'#spend_btn'
    })
    
    var p=$("#spend").datagrid('getPager');
    //绑定翻页操作
    $(p).pagination({
        onSelectPage:function(pageNumber, pageSize){
            QueryByPage(pageNumber, pageSize)
        }
    });
    QueryData();
}

//查询数据，页面初始化，以及点击查询时候，使用该函数获得页数，然后调用QueryByPage(pageNumber, pageSize)来查询
function QueryData(){
    var options=$("#spend").datagrid('getPager').data("pagination").options;
//    console.log(options);   
    var pageNumber=options.pageNumber;
    var pageSize=options.pageSize;
    if (pageNumber<1){
        pageNumber=1;
    }
    QueryByPage(pageNumber, pageSize);
}
//页面变化时，根据相应页面及参数 查询数据
function QueryByPage(pageNumber, pageSize){
    console.log("QueryData(pageNumber, pageSize)"+pageNumber+pageSize);
    var url="spend_findByPage.do";
    var params={};
    params.startrows=(pageNumber-1)*pageSize;
    params.pagesize=pageSize;
    
//    params.spend_date_start=$("#starttime").val();
//    params.spend_date_end=$("#endtime").val();           
//    params.designer=$("#designer").val();
//    params.custodian=$("#custodian").val();
//    params.customer_phone=$("#customer_phone").val();
//    params.last_pay=$("#last_pay").is(':checked')?1:null;

    console.log(params);
    $.post(url,params,function(result){
        console.log(result.data);
        $("#spend").datagrid('loadData',result.data);
    });
}


function contract_reload(){
    QueryData();
}

//将后台传过来的毫秒日期格式，格式化成本地日期格式。 
//在页面标签里直接使用data-options="formatter:dateFormate" 即可将日期格式化显示
function dateFormate(value,row,index){
    if(value==null){
        return ""
    }
    var date=new Date(value);
    return date.toLocaleDateString();
}



//修改合同
function spend_update(){
    var rows=$("#spend").datagrid('getSelected');
    var name="更新spend-"+rows.id
    addPanelTables(name,"spend_page_load.do",rows);
    
}

//打开新建合同页面
function spend_add(){
    addPanelTables("新建spend","spend_page_load.do");
}

function addPanelTables(name,page,rows){
    $('#tt').tabs('add',{
            title: name,
            href: page,
            closable: true,
            onLoad:function(){
                console.log(rows);
    $("#spend_form").data("title",name)
    if(rows==null){return}
    $("#spend_form").data("id",rows.id)
                setMessage(rows);    
            }
    });    
}
function setMessage(rows){
    if(rows==null){return}
    var id=rows.id;
    var url='spend_findById.do';
    var param={'id':id};
    $.post(url,param,function(result){
        console.log(result);
        $("#spend_form").form('load',result.data);
    })
}



//====基础增查改（打开页面），删==

function spend_del(){
    var spend=$("#spend").datagrid('getSelected');
    if(!spend){
        return alert("请选择一条记录");
    }
    var id=spend.id;

    var message="确认删除 <br>id："+id;
    $('#spendMessage').html(message);
    $('#spendMessage').data("id",id);
    $('#spend_del_confirm').window('open');
}


function spend_del_confirm(){
    $('#spendMessage').html();
    $('#spend_del_confirm').window('close');
    var url='spend_del.do';
    var param={'id':$('#spendMessage').data('id')};
    $.post(url,param,function(result){
        alert(result.data);
        QueryData();
    });
}
function spend_del_cancel(){
    
    $('#spendMessage').html();
    $('#spend_del_confirm').window('close');
}

