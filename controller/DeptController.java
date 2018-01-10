package controller.set;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.ADO.QueryDept;
import entity.set.Dept;
import myutils.JsonResult;
import service.set.DeptService;

@Controller
public class DeptController {
    @Resource(name="deptService")
    private DeptService deptService;
 
    @RequestMapping("dept_index_load.do")
    public String dept_index_load() {
        return "set/dept_index";
    }
 
    @RequestMapping("dept_page_load.do")
    public String dept_page_load() {
        return "set/page/dept_page";
    }

    @RequestMapping("dept_add.do")
    @ResponseBody
    public JsonResult dept_add(Dept dept) {
        if(dept==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=deptService.addDept(dept);
        if(result_number!=1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("dept_adds.do")
    @ResponseBody
    public JsonResult dept_adds(List<Dept> list) {
        if(list==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=deptService.addDepts(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("dept_del.do")
    @ResponseBody
    public JsonResult dept_del(Integer id) {
        if(id==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=deptService.delDept(id);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("dept_dels.do")
    @ResponseBody
    public JsonResult dept_dels(List<Integer> list) {
        if(list==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=deptService.delDepts(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("dept_update.do")
    @ResponseBody
    public JsonResult dept_update(Dept dept) {
        if(dept==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=deptService.updateDept(dept);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("dept_updates.do")
    @ResponseBody
    public JsonResult dept_updates(List<Dept> list) {
        if(list==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=deptService.updateDepts(list);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("dept_findById.do")
    @ResponseBody
    public JsonResult dept_findById(Integer id) {
        if(id==null) {
            return new JsonResult("查询对象不能为空");
        }
        Dept dept=deptService.findDeptById(id);
        if(dept==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(dept);
    }
 
    @RequestMapping("dept_findByPage.do")
    @ResponseBody
    public JsonResult dept_findByPage(QueryDept queryDept) {
        if(queryDept==null) {
            return new JsonResult("查询对象不能为空");
        }
        Map<String,Object> map=deptService.findDeptByPage(queryDept);
        if(map==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(map);
    }
 

    @RequestMapping("dept_findByDept_name.do")
    @ResponseBody
    public JsonResult dept_findByDept_name(String dept_name) {
        if(dept_name==null) {
            return new JsonResult("查询对象不能为空");
        }
        Dept dept=deptService.findDeptByDept_name(dept_name);
        if(dept==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(dept);
    }
 
 
}
