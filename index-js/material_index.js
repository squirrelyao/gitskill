$(function(){
    init();
    
})

//初始化表格 以及翻页框  
function init(){
    $("#material").datagrid({
    //    url:'findall.do?name=1',
        rownumbers:true,
        pagination:true,
        singleSelect:true,
        method:'post',
        toolbar:'#material_btn'
    })
    
    var p=$("#material").datagrid('getPager');
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
    var options=$("#material").datagrid('getPager').data("pagination").options;
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
    var url="material_findByPage.do";
    var params={};
    params.startrows=(pageNumber-1)*pageSize;
    params.pagesize=pageSize;
    
//    params.material_date_start=$("#starttime").val();
//    params.material_date_end=$("#endtime").val();           
//    params.designer=$("#designer").val();
//    params.custodian=$("#custodian").val();
//    params.customer_phone=$("#customer_phone").val();
//    params.last_pay=$("#last_pay").is(':checked')?1:null;

    console.log(params);
    $.post(url,params,function(result){
        console.log(result.data);
        $("#material").datagrid('loadData',result.data);
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
function material_update(){
    var rows=$("#material").datagrid('getSelected');
    var name="更新material-"+rows.id
    addPanelTables(name,"material_page_load.do",rows);
    
}

//打开新建合同页面
function material_add(){
    addPanelTables("新建material","material_page_load.do");
}

function addPanelTables(name,page,rows){
    $('#tt').tabs('add',{
            title: name,
            href: page,
            closable: true,
            onLoad:function(){
                console.log(rows);
    $("#material_form").data("title",name)
    if(rows==null){return}
    $("#material_form").data("id",rows.id)
                setMessage(rows);    
            }
    });    
}
function setMessage(rows){
    if(rows==null){return}
    var id=rows.id;
    var url='material_findById.do';
    var param={'id':id};
    $.post(url,param,function(result){
        console.log(result);
        $("#material_form").form('load',result.data);
    })
}



//====基础增查改（打开页面），删==

function material_del(){
    var material=$("#material").datagrid('getSelected');
    if(!material){
        return alert("请选择一条记录");
    }
    var id=material.id;

    var message="确认删除 <br>id："+id;
    $('#materialMessage').html(message);
    $('#materialMessage').data("id",id);
    $('#material_del_confirm').window('open');
}


function material_del_confirm(){
    $('#materialMessage').html();
    $('#material_del_confirm').window('close');
    var url='material_del.do';
    var param={'id':$('#materialMessage').data('id')};
    $.post(url,param,function(result){
        alert(result.data);
        QueryData();
    });
}
function material_del_cancel(){
    
    $('#materialMessage').html();
    $('#material_del_confirm').window('close');
}

