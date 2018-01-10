<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<style>
/* #table.td{border:solid #add9c0; border-width:0px 1px 1px 0px; padding:1px 0px;}
#table{border:solid #add9c0; border-width:1px 0px 0px 1px;} */
</style>           
<script type="text/javascript" src="js/table/spend_page.js"></script>

<div style="padding:10px 60px 20px 60px">
    <form id="spend_form" action="" method="post">   
        <table style="border:solid blue; cellspacing:10px; border-width:1px 1px 1px 1px;">
            <tr>
                
                <td><input class="easyui-textbox" name="id" type='hidden'></td>
                <td><span>contract_addr</span></td>
                <td><input class="easyui-textbox" name="contract_addr"></td>
            </tr>
            <tr>
                <td><span>spend_project1</span></td>
                <td><input class="easyui-textbox" name="spend_project1"></td>
                <td><span>spend_project2</span></td>
                <td><input class="easyui-textbox" name="spend_project2"></td>
            </tr>
            <tr>
                <td><span>spend_date</span></td>
                <td><input class="easyui-datebox" name="spend_date"></td>
                <td><span>spend_money</span></td>
                <td><input class="easyui-textbox" name="spend_money"></td>
            </tr>
            <tr>
                <td><span>spend_way</span></td>
                <td><input class="easyui-textbox" name="spend_way"></td>
                <td><span>payer</span></td>
                <td><input class="easyui-textbox" name="payer"></td>
            </tr>
            <tr>
                <td><span>note</span></td>
                <td><input class="easyui-textbox" name="note"></td>

            <tr>
                <td colspan="6">
                    <a id="save_spend_btn" href="#" align="center"  class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="save_spend();">
                        保存
                    </a>
                </td>    
            </tr>  
        </table>
     
    </form> 
</div>

<div id="spend_confirm" class="easyui-window" title="Window Layout" data-options="iconCls:'icon-save',closed:true,tital:'保存信息'" style="width:500px;height:200px;padding:5px;">  
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'center'" style="padding:10px;">
            <p id="spend_message"></p>
        </div>
        <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="#" onclick="addmore();" style="width:80px">继续添加</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="#" onclick="closetab();" style="width:80px">完成退出</a>
       </div>
    </div>
</div>
  