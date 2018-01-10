<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<style>
/* #table.td{border:solid #add9c0; border-width:0px 1px 1px 0px; padding:1px 0px;}
#table{border:solid #add9c0; border-width:1px 0px 0px 1px;} */
</style>           
<script type="text/javascript" src="js/table/contract_page.js"></script>

<div style="padding:10px 60px 20px 60px">
    <form id="contract_form" action="" method="post">   
        <table style="border:solid blue; cellspacing:10px; border-width:1px 1px 1px 1px;">
            <tr>
                
                <td><input class="easyui-textbox" name="id" type='hidden'></td>
                <td><span>contract_number</span></td>
                <td><input class="easyui-textbox" name="contract_number"></td>
            </tr>
            <tr>
                <td><span>contract_date</span></td>
                <td><input class="easyui-datebox" name="contract_date"></td>
                <td><span>contract_addr</span></td>
                <td><input class="easyui-textbox" name="contract_addr"></td>
            </tr>
            <tr>
                <td><span>contract_area</span></td>
                <td><input class="easyui-textbox" name="contract_area"></td>
                <td><span>contract_type</span></td>
                <td><input class="easyui-textbox" name="contract_type"></td>
            </tr>
            <tr>
                <td><span>contract_starttime</span></td>
                <td><input class="easyui-datebox" name="contract_starttime"></td>
                <td><span>contract_endtime</span></td>
                <td><input class="easyui-datebox" name="contract_endtime"></td>
            </tr>
            <tr>
                <td><span>limit_time</span></td>
                <td><input class="easyui-textbox" name="limit_time"></td>
                <td><span>customer_name</span></td>
                <td><input class="easyui-textbox" name="customer_name"></td>
            </tr>
            <tr>
                <td><span>customer_phone</span></td>
                <td><input class="easyui-textbox" name="customer_phone"></td>
                <td><span>designer</span></td>
                <td><input class="easyui-textbox" name="designer"></td>
            </tr>
            <tr>
                <td><span>custodian</span></td>
                <td><input class="easyui-textbox" name="custodian"></td>
                <td><span>servicer</span></td>
                <td><input class="easyui-textbox" name="servicer"></td>
            </tr>
            <tr>
                <td><span>service_time</span></td>
                <td><input class="easyui-textbox" name="service_time"></td>
                <td><span>contract_price</span></td>
                <td><input class="easyui-textbox" name="contract_price"></td>
            </tr>
            <tr>
                <td><span>contract_total_price</span></td>
                <td><input class="easyui-textbox" name="contract_total_price"></td>
                <td><span>management_cost</span></td>
                <td><input class="easyui-textbox" name="management_cost"></td>
            </tr>
            <tr>
                <td><span>rebate</span></td>
                <td><input class="easyui-textbox" name="rebate"></td>
                <td><span>repay</span></td>
                <td><input class="easyui-textbox" name="repay"></td>
            </tr>
            <tr>
                <td><span>first_pay</span></td>
                <td><input class="easyui-textbox" name="first_pay"></td>
                <td><span>second_pay</span></td>
                <td><input class="easyui-textbox" name="second_pay"></td>
            </tr>
            <tr>
                <td><span>third_pay</span></td>
                <td><input class="easyui-textbox" name="third_pay"></td>
                <td><span>last_pay</span></td>
                <td><input class="easyui-textbox" name="last_pay"></td>
            </tr>
            <tr>
                <td><span>buliding_mterials_second</span></td>
                <td><input class="easyui-textbox" name="buliding_mterials_second"></td>
                <td><span>buliding_mterials_third</span></td>
                <td><input class="easyui-textbox" name="buliding_mterials_third"></td>
            </tr>
            <tr>
                <td><span>total_pay</span></td>
                <td><input class="easyui-textbox" name="total_pay"></td>
                <td><span>profit</span></td>
                <td><input class="easyui-textbox" name="profit"></td>
            </tr>
            <tr>
                <td><span>status</span></td>
                <td><input class="easyui-textbox" name="status"></td>
                <td><span>form_maker</span></td>
                <td><input class="easyui-textbox" name="form_maker"></td>
            </tr>
            <tr>
                <td><span>last_modify</span></td>
                <td><input class="easyui-datebox" name="last_modify"></td>

            <tr>
                <td colspan="6">
                    <a id="save_contract_btn" href="#" align="center"  class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="save_contract();">
                        保存
                    </a>
                </td>    
            </tr>  
        </table>
     
    </form> 
</div>

<div id="contract_confirm" class="easyui-window" title="Window Layout" data-options="iconCls:'icon-save',closed:true,tital:'保存信息'" style="width:500px;height:200px;padding:5px;">  
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'center'" style="padding:10px;">
            <p id="contract_message"></p>
        </div>
        <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="#" onclick="addmore();" style="width:80px">继续添加</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="#" onclick="closetab();" style="width:80px">完成退出</a>
       </div>
    </div>
</div>
  