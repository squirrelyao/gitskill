<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript" src="js/table/income_index.js"></script>   
<table id="income"  style="width:80%;height:60%">
    <thead>
        <tr>
            <th data-options="field:'id',width:80">id</th>
            <th data-options="field:'contract_addr',width:80">contract_addr</th>
            <th data-options="field:'collection_date',width:80,formatter:dateFormate">collection_date</th>
            <th data-options="field:'collection_project',width:80">collection_project</th>
            <th data-options="field:'collection_money',width:80">collection_money</th>
            <th data-options="field:'get_way',width:80">get_way</th>
            <th data-options="field:'rebate',width:80">rebate</th>
            <th data-options="field:'payee',width:80">payee</th>
            <th data-options="field:'note',width:80,hidden:'true'">note</th>

        </tr>
    </thead>

    <div id="income_btn" style="padding:5px;height:auto">
        <div style="margin-bottom:5px">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="income_add();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="income_update();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="income_show();"></a> 
            <a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="income_reload();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="income_del();"></a>
        </div>
        <div>
            a: <input id="starttime" class="easyui-datebox" style="width:100px">
            b: <input id="endtime" class="easyui-datebox" style="width:100px">
            c: <input id="designer" class="easyui-textbox" panelHeight="auto" style="width:120px">
            d: <input id="last_pay" type="checkbox" >
            e: <input id="custodian" class="easyui-textbox" panelHeight="auto" style="width:120px">
            f: <input id="customer_phone" class="easyui-textbox" panelHeight="auto" style="width:120px">         
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="income_query()">查询</a>
        </div>
        </div>
</table>
      
<div id="income_del_confirm" class="easyui-window" title="确认删除" style="width:400px;height:200px"   
        data-options="modal:true,inline:true,closed:true">     
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'center'" style="padding:10px;">
            <p id="incomeMessage"></p> 
        </div>
        <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="#" onclick="income_del_confirm();" style="width:80px">确认删除</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="#" onclick="income_del_cancel();" style="width:80px">放弃退出</a>
        </div>
    </div>                
</div> 
 



