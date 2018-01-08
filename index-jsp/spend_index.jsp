<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript" src="js/table/spend_index.js"></script>   
<table id="spend"  style="width:80%;height:60%">
    <thead>
        <tr>
            <th data-options="field:'id',width:80">id</th>
            <th data-options="field:'contract_addr',width:80">contract_addr</th>
            <th data-options="field:'spend_project1',width:80">spend_project1</th>
            <th data-options="field:'spend_project2',width:80">spend_project2</th>
            <th data-options="field:'spend_date',width:80">spend_date</th>
            <th data-options="field:'spend_money',width:80">spend_money</th>
            <th data-options="field:'spend_way',width:80">spend_way</th>
            <th data-options="field:'payer',width:80">payer</th>
            <th data-options="field:'note',width:80,hidden:'true'">note</th>

        </tr>
    </thead>

    <div id="spend_btn" style="padding:5px;height:auto">
        <div style="margin-bottom:5px">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="spend_add();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="spend_update();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="spend_show();"></a> 
            <a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="spend_reload();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="spend_del();"></a>
        </div>
        <div>
            a: <input id="starttime" class="easyui-datebox" style="width:100px">
            b: <input id="endtime" class="easyui-datebox" style="width:100px">
            c: <input id="designer" class="easyui-textbox" panelHeight="auto" style="width:120px">
            d: <input id="last_pay" type="checkbox" >
            e: <input id="custodian" class="easyui-textbox" panelHeight="auto" style="width:120px">
            f: <input id="customer_phone" class="easyui-textbox" panelHeight="auto" style="width:120px">         
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="spend_query()">��ѯ</a>
        </div>
        </div>
</table>
      
<div id="spend_del_confirm" class="easyui-window" title="ȷ��ɾ��" style="width:400px;height:200px"   
        data-options="modal:true,inline:true,closed:true">     
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'center'" style="padding:10px;">
            <p id="spendMessage"></p> 
        </div>
        <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="#" onclick="spend_del_confirm();" style="width:80px">ȷ��ɾ��</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="#" onclick="spend_del_cancel();" style="width:80px">�����˳�</a>
        </div>
    </div>                
</div> 
 
<%@ include file="list/spend_table_page.jsp" %>


