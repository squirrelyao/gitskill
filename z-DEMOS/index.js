"$(function(){
    init();
 
})

//初始化表格 以及翻页框  
function init(){
    $(""#entity_name"").datagrid({
      rownumbers:true,
      pagination:true,
      singleSelect:true,
      method:'post',
      toolbar:'#entity_name_btn'
    })
 
    var p=$(""#entity_name"").datagrid('getPager');
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
    var options=$(""#entity_name"").datagrid('getPager').data(""pagination"").options;
    var pageNumber=options.pageNumber;
    var pageSize=options.pageSize;
    QueryByPage(pageNumber, pageSize);
}
//页面变化时，根据相应页面及参数 查询数据
function QueryByPage(pageNumber, pageSize){
    var url=""entity_name_findByPage.do"";
    var params={};
    params.startrows=pageNumber*pageSize;
    params.pagesize=pageSize;
 
  // params.entity_name_date_start=$(""#starttime"").val();
  // params.entity_name_date_end=$(""#endtime"").val();     
  // params.designer=$(""#designer"").val();
  // params.custodian=$(""#custodian"").val();
  // params.customer_phone=$(""#customer_phone"").val();
  // params.last_pay=$(""#last_pay"").is(':checked')?1:null;

    $.post(url,params,function(result){
        console.log(result.data);
        $(""#entity_name"").datagrid('loadData',result.data);
    });
}


//将后台传过来的毫秒日期格式，格式化成本地日期格式。 
//在页面标签里直接使用data-options=""formatter:dateFormate"" 即可将日期格式化显示
function dateFormate(value,row,index){
    if(value==null){
        return """"
    }
    var date=new Date(value);
    return date.toLocaleDateString();
}



//修改合同
function entity_name_update(){
    var rows=$(""#entity_name"").datagrid('getSelected');
    var name=""entity_name""+rows.id
    addPanelTables(name,""entity_name_page_load.do"",rows);
 
}

//打开新建合同页面
function entity_name_add(){
    addPanelTables(""新建合同表"",""entity_name_page_load.do"");
}

function addPanelTables(name,page,rows){
    $('#tt').tabs('add',{
        title: name,
        href: page,
        closable: true,
        onLoad:function(){
            console.log(rows);
            setMessage(rows); 
        }
    }); 
}
function setMessage(rows){
    if(rows==null){return}
    var id=rows.id;
    var url='entity_name_findById.do';
    var param={'id':id};
    $.post(url,param,function(result){
        console.log(result);
        $(""#entity_name_form"").form('load',result.data);
    })
}



//====基础增查改（打开页面），删==

function entity_name_del(){
    var entity_name=$(""#entity_name"").datagrid('getSelected');
    if(!entity_name){
        return alert(""请选择一条记录"");
    }
    var id=entity_name.id;

    var message=""确认删除 <br>id：""+id;
    $('#entity_nameMessage').html(message);
    $('#entity_nameMessage').data(""id"",id);
    $('#entity_name_del_confirm').window('open');
}


function entity_name_del_confirm(){
 $('#entity_nameMessage').html();
 $('#entity_name_del_confirm').window('close');
 var url='entity_name_del.do';
 var param={'id':$('#entity_nameMessage').data('id')};
 $.post(url,param,function(result){
  alert(result.data);
  QueryData();
 });
}
function entity_name_del_cancel(){
 
 $('#entity_nameMessage').html();
 $('#entity_name_del_confirm').window('close');
}
"
