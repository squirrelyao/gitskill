<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript" src="js/table/material_index.js"></script>   
<table id="material"  style="width:80%;height:60%">
    <thead>
        <tr>
            <th data-options="field:'id',width:80">id</th>
            <th data-options="field:'contract_addr',width:80">contract_addr</th>
            <th data-options="field:'mat_getway',width:80">mat_getway</th>
            <th data-options="field:'mat_name',width:80">mat_name</th>
            <th data-options="field:'mat_factory',width:80">mat_factory</th>
            <th data-options="field:'mat_price',width:80">mat_price</th>
            <th data-options="field:'mat_budget',width:80">mat_budget</th>
            <th data-options="field:'note',width:80">note</th>

        </tr>
    </thead>

    <div id="material_btn" style="padding:5px;height:auto">
        <div style="margin-bottom:5px">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="material_add();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="material_update();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="material_show();"></a> 
            <a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="material_reload();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="material_del();"></a>
        </div>
        <div>
            a: <input id="starttime" class="easyui-datebox" style="width:100px">
            b: <input id="endtime" class="easyui-datebox" style="width:100px">
            c: <input id="designer" class="easyui-textbox" panelHeight="auto" style="width:120px">
            d: <input id="last_pay" type="checkbox" >
            e: <input id="custodian" class="easyui-textbox" panelHeight="auto" style="width:120px">
            f: <input id="customer_phone" class="easyui-textbox" panelHeight="auto" style="width:120px">         
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="material_query()">查询</a>
        </div>
        </div>
</table>
      
<div id="material_del_confirm" class="easyui-window" title="确认删除" style="width:400px;height:200px"   
        data-options="modal:true,inline:true,closed:true">     
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'center'" style="padding:10px;">
            <p id="materialMessage"></p> 
        </div>
        <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="#" onclick="material_del_confirm();" style="width:80px">确认删除</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="#" onclick="material_del_cancel();" style="width:80px">放弃退出</a>
        </div>
    </div>                
</div> 
 
<%@ include file="list/material_table_page.jsp" %>



