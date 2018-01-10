 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <style>
#table.td{border:solid #add9c0; border-width:0px 1px 1px 0px; padding:10px 0px;}
#table{border:solid #add9c0; border-width:1px 0px 0px 1px;}
</style>   
 <div class="easyui-panel" title="新建收入表" style="width:80%">
 	<form id="new_constrc" action="" style="height:160px,width:160px">
        
       <table style="border:solid #add9c0; border-width:10px 10px 10px 10px;">
        	<tr>
        		<td><span>合同编号</span></td>
        		<td><input class="easyui-textbox" name="contract_number"></td>
        		<td><span>合同日期</span></td>
        		<td><input class="easyui-datebox"  name="contract_date"></td>

        	</tr>
        	<tr>
        		<td><span>施工地址</span></td>
        		<td colspan="5"><input class="easyui-textbox" name="contract_addr" style="width:80%"></td>
        	</tr>
        	<tr>
        		<td><span>施工面积</span></td>
        		<td><input class="easyui-textbox" name="contract_area"></td>
        		<td><span>承包方式</span></td>
        		<td><input class="easyui-textbox" name="contract_type"></td>
        		<td><span>施工时间</span></td>
        		<td><input class="easyui-datebox" name="contract_starttime"></td>
        	
        		
        	</tr>
        	
        	<tr>
        		<td><span>工期</span></td>
        		<td><input class="easyui-textbox" name="limit_time"></td>
        		<td><span>设计师</span></td>
        		<td><input class="easyui-combobox" name="designer"></td>
        		<td><span>监理</span></td>
        		<td><input class="easyui-combobox" name="custodian"></td>
        		
        		
        	</tr>
        	<tr>
        		<td><span>业务员</span></td>
        		<td><input class="easyui-combobox" name="servicer"></td>
        		<td><span>客户姓名</span></td>
        		<td><input class="easyui-textbox" name="customer_name"></td>
        		<td><span>客户电话</span></td>
        		<td><input class="easyui-textbox" name="customer_phone"></td>
        	</tr>
        		<tr>
        		<td><span>一期款</span></td>
        		<td><input class="easyui-textbox" name="first_pay"></td>
        		<td><span>二期款</span></td>
        		<td><input class="easyui-textbox" name="second_pay"></td>
        		<td><span>三期款</span></td>
        		<td><input class="easyui-textbox" name="third_pay"></td>
        		
        	</tr>
        	<tr>
        		<td><span>主材二期</span></td>
        		<td><input class="easyui-textbox" name="buliding_mterials_second"></td>
        		<td><span>主材三期</span></td>
        		<td><input class="easyui-textbox" name="buliding_mterials_third"></td>
        		<td><span>承保期限</span></td>
        		<td><input class="easyui-textbox" name="service_time"></td> 
        	</tr>
        		<tr>
        		<td><span>尾款2%</span></td>
        		<td><input class="easyui-textbox" name="last_pay"></td>
        		<td><span>总价款</span></td>
        		<td><input class="easyui-textbox" name="total_pay"></td>
        		<td><span>净利润</span></td>
        		<td><input class="easyui-textbox" name="profit"></td>
        		
        		
        		
        	</tr>
        	<tr>
        		<td colspan="6"><a id="btn" href="#" align="center"  class="easyui-linkbutton" data-options="iconCls:'icon-save'">保存</a></td>  		
        	
        	</tr> 	
      	</table>
     
     </form> 
     
 </div>
 
 
 
 
 
 
 
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<style>
/* #table.td{border:solid #add9c0; border-width:0px 1px 1px 0px; padding:1px 0px;}
#table{border:solid #add9c0; border-width:1px 0px 0px 1px;} */
</style>  									
<script type="text/javascript" src="js/pakge/entity_name_page.js"></script>

<div style="padding:10px 60px 20px 60px">
 	<form id="entity_name_form" action="" method="post">
        
       <table style="border:solid blue; cellspacing:10px; border-width:1px 1px 1px 1px;">
//tr_message

        	<tr>
        		<td colspan="6">
					<a id="save_entity_name_btn" href="#" align="center"  class="easyui-linkbutton" data-options="iconCls:'icon-save'" onclick="save_entity_name();">
						保存
					</a>
				</td>  		
        	</tr> 	
      	</table>
     
     </form> 
    </div> 
 <div id="entity_name_confirim" class="easyui-window" title="Window Layout" data-options="iconCls:'icon-save',closed:true,tital:'保存信息'" style="width:500px;height:200px;padding:5px;">		
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center'" style="padding:10px;">
				<p id="entity_name_message"></p>
			</div>
			<div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="#" onclick="addmore();" style="width:80px">继续添加</a>
				<a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="#" onclick="closetab();" style="width:80px">完成退出</a>
			</div>
		</div>
</div>
  
  
  
        	<tr>
        		<td><span>list_name</span></td>
        		<td><input class="easyui-textbox" name="list_name"></td>
        		<td><span>list_name2</span></td>
        		<td><input class="easyui-datebox"  name="list_name2"></td>
        	</tr>
  
  
  