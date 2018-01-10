$(function(){
    init();
    
})

//初始化表格 以及翻页框  
function init(){
    $("#dept").datagrid({
    //    url:'findall.do?name=1',
        rownumbers:true,
        pagination:true,
        singleSelect:true,
        method:'post',
        toolbar:'#dept_btn'
    })
    
    var p=$("#dept").datagrid('getPager');
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
    var options=$("#dept").datagrid('getPager').data("pagination").options;
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
    var url="dept_findByPage.do";
    var params={};
    params.startrows=(pageNumber-1)*pageSize;
    params.pagesize=pageSize;
    
//    params.dept_date_start=$("#starttime").val();
//    params.dept_date_end=$("#endtime").val();           
//    params.designer=$("#designer").val();
//    params.custodian=$("#custodian").val();
//    params.customer_phone=$("#customer_phone").val();
//    params.last_pay=$("#last_pay").is(':checked')?1:null;

    console.log(params);
    $.post(url,params,function(result){
        console.log(result.data);
        $("#dept").datagrid('loadData',result.data);
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
function dept_update(){
    var rows=$("#dept").datagrid('getSelected');
    var name="更新dept-"+rows.id
    addPanelTables(name,"dept_page_load.do",rows);
    
}

//打开新建合同页面
function dept_add(){
    addPanelTables("新建dept","dept_page_load.do");
}

function addPanelTables(name,page,rows){
    $('#tt').tabs('add',{
            title: name,
            href: page,
            closable: true,
            onLoad:function(){
                console.log(rows);
    $("#dept_form").data("title",name)
    if(rows==null){return}
    $("#dept_form").data("id",rows.id)
                setMessage(rows);    
            }
    });    
}
function setMessage(rows){
    if(rows==null){return}
    var id=rows.id;
    var url='dept_findById.do';
    var param={'id':id};
    $.post(url,param,function(result){
        console.log(result);
        $("#dept_form").form('load',result.data);
    })
}



//====基础增查改（打开页面），删==

function dept_del(){
    var dept=$("#dept").datagrid('getSelected');
    if(!dept){
        return alert("请选择一条记录");
    }
    var id=dept.id;

    var message="确认删除 <br>id："+id;
    $('#deptMessage').html(message);
    $('#deptMessage').data("id",id);
    $('#dept_del_confirm').window('open');
}


function dept_del_confirm(){
    $('#deptMessage').html();
    $('#dept_del_confirm').window('close');
    var url='dept_del.do';
    var param={'id':$('#deptMessage').data('id')};
    $.post(url,param,function(result){
        alert(result.data);
        QueryData();
    });
}
function dept_del_cancel(){
    
    $('#deptMessage').html();
    $('#dept_del_confirm').window('close');
}

