package controller.set;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.ADO.QueryEmp;
import entity.set.Emp;
import myutils.JsonResult;
import service.set.EmpService;

@Controller
public class EmpController {
    @Resource(name="empService")
    private EmpService empService;
 
    @RequestMapping("emp_index_load.do")
    public String emp_index_load() {
        return "set/emp_index";
    }
 
    @RequestMapping("emp_page_load.do")
    public String emp_page_load() {
        return "set/page/emp_page";
    }

    @RequestMapping("emp_add.do")
    @ResponseBody
    public JsonResult emp_add(Emp emp) {
        if(emp==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=empService.addEmp(emp);
        if(result_number!=1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("emp_adds.do")
    @ResponseBody
    public JsonResult emp_adds(List<Emp> list) {
        if(list==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=empService.addEmps(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("emp_del.do")
    @ResponseBody
    public JsonResult emp_del(Integer id) {
        if(id==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=empService.delEmp(id);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("emp_dels.do")
    @ResponseBody
    public JsonResult emp_dels(List<Integer> list) {
        if(list==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=empService.delEmps(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("emp_update.do")
    @ResponseBody
    public JsonResult emp_update(Emp emp) {
        if(emp==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=empService.updateEmp(emp);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("emp_updates.do")
    @ResponseBody
    public JsonResult emp_updates(List<Emp> list) {
        if(list==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=empService.updateEmps(list);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("emp_findById.do")
    @ResponseBody
    public JsonResult emp_findById(Integer id) {
        if(id==null) {
            return new JsonResult("查询对象不能为空");
        }
        Emp emp=empService.findEmpById(id);
        if(emp==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(emp);
    }
 
    @RequestMapping("emp_findByPage.do")
    @ResponseBody
    public JsonResult emp_findByPage(QueryEmp queryEmp) {
        if(queryEmp==null) {
            return new JsonResult("查询对象不能为空");
        }
        Map<String,Object> map=empService.findEmpByPage(queryEmp);
        if(map==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(map);
    }
 

    @RequestMapping("emp_findByEmp_name.do")
    @ResponseBody
    public JsonResult emp_findByEmp_name(String emp_name) {
        if(emp_name==null) {
            return new JsonResult("查询对象不能为空");
        }
        Emp emp=empService.findEmpByEmp_name(emp_name);
        if(emp==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(emp);
    }

    @RequestMapping("emp_findByUser_name.do")
    @ResponseBody
    public JsonResult emp_findByUser_name(String user_name) {
        if(user_name==null) {
            return new JsonResult("查询对象不能为空");
        }
        Emp emp=empService.findEmpByUser_name(user_name);
        if(emp==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(emp);
    }
 
 
}
