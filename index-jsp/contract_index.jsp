<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript" src="js/table/contract_index.js"></script>   
<table id="contract"  style="width:80%;height:60%">
    <thead>
        <tr>
            <th data-options="field:'id',width:80">id</th>
            <th data-options="field:'contract_number',width:80">contract_number</th>
            <th data-options="field:'contract_date',width:80,formatter:dateFormate">contract_date</th>
            <th data-options="field:'contract_addr',width:80">contract_addr</th>
            <th data-options="field:'contract_area',width:80">contract_area</th>
            <th data-options="field:'contract_type',width:80">contract_type</th>
            <th data-options="field:'contract_starttime',width:80,formatter:dateFormate">contract_starttime</th>
            <th data-options="field:'contract_endtime',width:80,formatter:dateFormate">contract_endtime</th>
            <th data-options="field:'limit_time',width:80,hidden:'true'">limit_time</th>
            <th data-options="field:'customer_name',width:80,hidden:'true'">customer_name</th>
            <th data-options="field:'customer_phone',width:80,hidden:'true'">customer_phone</th>
            <th data-options="field:'designer',width:80,hidden:'true'">designer</th>
            <th data-options="field:'custodian',width:80,hidden:'true'">custodian</th>
            <th data-options="field:'servicer',width:80,hidden:'true'">servicer</th>
            <th data-options="field:'service_time',width:80,hidden:'true'">service_time</th>
            <th data-options="field:'contract_price',width:80,hidden:'true'">contract_price</th>
            <th data-options="field:'contract_total_price',width:80,hidden:'true'">contract_total_price</th>
            <th data-options="field:'management_cost',width:80,hidden:'true'">management_cost</th>
            <th data-options="field:'rebate',width:80,hidden:'true'">rebate</th>
            <th data-options="field:'repay',width:80,hidden:'true'">repay</th>
            <th data-options="field:'first_pay',width:80,hidden:'true'">first_pay</th>
            <th data-options="field:'second_pay',width:80,hidden:'true'">second_pay</th>
            <th data-options="field:'third_pay',width:80,hidden:'true'">third_pay</th>
            <th data-options="field:'last_pay',width:80,hidden:'true'">last_pay</th>
            <th data-options="field:'buliding_mterials_second',width:80,hidden:'true'">buliding_mterials_second</th>
            <th data-options="field:'buliding_mterials_third',width:80,hidden:'true'">buliding_mterials_third</th>
            <th data-options="field:'total_pay',width:80,hidden:'true'">total_pay</th>
            <th data-options="field:'profit',width:80,hidden:'true'">profit</th>
            <th data-options="field:'status',width:80,hidden:'true'">status</th>
            <th data-options="field:'form_maker',width:80,hidden:'true'">form_maker</th>
            <th data-options="field:'last_modify',width:80,hidden:'true',formatter:dateFormate">last_modify</th>

        </tr>
    </thead>

    <div id="contract_btn" style="padding:5px;height:auto">
        <div style="margin-bottom:5px">
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="contract_add();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="contract_update();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="contract_show();"></a> 
            <a href="#" class="easyui-linkbutton" iconCls="icon-reload" plain="true" onclick="contract_reload();"></a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="contract_del();"></a>
        </div>
        <div>
            a: <input id="starttime" class="easyui-datebox" style="width:100px">
            b: <input id="endtime" class="easyui-datebox" style="width:100px">
            c: <input id="designer" class="easyui-textbox" panelHeight="auto" style="width:120px">
            d: <input id="last_pay" type="checkbox" >
            e: <input id="custodian" class="easyui-textbox" panelHeight="auto" style="width:120px">
            f: <input id="customer_phone" class="easyui-textbox" panelHeight="auto" style="width:120px">         
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="contract_query()">查询</a>
        </div>
        </div>
</table>
      
<div id="contract_del_confirm" class="easyui-window" title="确认删除" style="width:400px;height:200px"   
        data-options="modal:true,inline:true,closed:true">     
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'center'" style="padding:10px;">
            <p id="contractMessage"></p> 
        </div>
        <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="#" onclick="contract_del_confirm();" style="width:80px">确认删除</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="#" onclick="contract_del_cancel();" style="width:80px">放弃退出</a>
        </div>
    </div>                
</div> 
 



