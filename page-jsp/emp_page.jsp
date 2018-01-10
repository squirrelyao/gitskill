<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<style>
/* #table.td{border:solid #add9c0; border-width:0px 1px 1px 0px; padding:1px 0px;}
#table{border:solid #add9c0; border-width:1px 0px 0px 1px;} */
</style>           
<script type="text/javascript" src="js/set/emp_page.js"></script>

<div style="padding:10px 60px 20px 60px">
    <form id="emp_form" action="" method="post">   
        <table style="border:solid blue; cellspacing:10px; border-width:1px 1px 1px 1px;">
            <tr>
                
                <td><input class="easyui-textbox" name="id" type='hidden'></td>
                <td><span>emp_name</span></td>
                <td><input class="easyui-textbox" name="emp_name"></td>
            </tr>
            <tr>
                <td><span>dept_id</span></td>
                <td><input class="easyui-textbox" name="dept_id"></td>
                <td><span>master_id</span></td>
                <td><input class="easyui-textbox" name="master_id"></td>
            </tr>
            <tr>
                <td><span>user_name</span></td>
                <td><input class="easyui-textbox" name="user_name"></td>
                <td><span>password</span></td>
                <td><input class="easyui-textbox" name="password"></td>
            </tr>

            <tr>
                <td colspan="6">
                    <a id="save_emp_btn" href="#" align="center"  class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="save_emp();">
                        保存
                    </a>
                </td>    
            </tr>  
        </table>
     
    </form> 
</div>

<div id="emp_confirm" class="easyui-window" title="Window Layout" data-options="iconCls:'icon-save',closed:true,tital:'保存信息'" style="width:500px;height:200px;padding:5px;">  
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'center'" style="padding:10px;">
            <p id="emp_message"></p>
        </div>
        <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
            <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="#" onclick="addmore();" style="width:80px">继续添加</a>
            <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="#" onclick="closetab();" style="width:80px">完成退出</a>
       </div>
    </div>
</div>
  