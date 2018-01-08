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
 
    @RequestMapping("emp_page_load.do")
    public String emp_page_load() {
        return "set/emp_index";
    }
 
    @RequestMapping("emp_add.do")
    @ResponseBody
    public JsonResult emp_add(Emp emp) {
        if(emp==null) {
            return new JsonResult("���������Ϊ��");
        }
        int result_number=empService.addEmp(emp);
        if(result_number!=1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("����ɹ�");
    }
 
    @RequestMapping("emp_adds.do")
    @ResponseBody
    public JsonResult emp_adds(List<Emp> list) {
        if(list==null) {
            return new JsonResult("���������Ϊ��");
        }
        int result_number=empService.addEmps(list);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("����ɹ�");
    }
 
    @RequestMapping("emp_del.do")
    @ResponseBody
    public JsonResult emp_del(Integer id) {
        if(id==null) {
            return new JsonResult("ɾ��������Ϊ��");
        }
        int result_number=empService.delEmp(id);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("����ɹ�");
    }
 
    @RequestMapping("emp_dels.do")
    @ResponseBody
    public JsonResult emp_dels(List<Integer> list) {
        if(list==null) {
            return new JsonResult("ɾ��������Ϊ��");
        }
        int result_number=empService.delEmps(list);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("����ɹ�");
    }
 
    @RequestMapping("emp_update.do")
    @ResponseBody
    public JsonResult emp_update(Emp emp) {
        if(emp==null) {
            return new JsonResult("���¶�����Ϊ��");
        }
        int result_number=empService.updateEmp(emp);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("���³ɹ�");
    }
 
    @RequestMapping("emp_updates.do")
    @ResponseBody
    public JsonResult emp_updates(List<Emp> list) {
        if(list==null) {
            return new JsonResult("���¶�����Ϊ��");
        }
        int result_number=empService.updateEmps(list);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("���³ɹ�");
    }
 
    @RequestMapping("emp_findById.do")
    @ResponseBody
    public JsonResult emp_findById(Integer id) {
        if(id==null) {
            return new JsonResult("��ѯ������Ϊ��");
        }
        Emp emp=empService.findEmpById(id);
        if(emp==null) {
            return new JsonResult("��ѯʧ��");
        }
        return new JsonResult(emp);
    }
 
    @RequestMapping("emp_findByPage.do")
    @ResponseBody
    public JsonResult emp_findByPage(QueryEmp queryEmp) {
        if(queryEmp==null) {
            return new JsonResult("��ѯ������Ϊ��");
        }
        Map<String,Object> map=empService.findEmpByPage(queryEmp);
        if(map==null) {
            return new JsonResult("��ѯʧ��");
        }
        return new JsonResult(map);
    }
 

    @RequestMapping("emp_findByEmp_name.do")
    @ResponseBody
    public JsonResult emp_findByEmp_name(String emp_name) {
        if(emp_name==null) {
            return new JsonResult("��ѯ������Ϊ��");
        }
        Emp emp=empService.findEmpByEmp_name(emp_name);
        if(emp==null) {
            return new JsonResult("��ѯʧ��");
        }
        return new JsonResult(emp);
    }

    @RequestMapping("emp_findByUser_name.do")
    @ResponseBody
    public JsonResult emp_findByUser_name(String user_name) {
        if(user_name==null) {
            return new JsonResult("��ѯ������Ϊ��");
        }
        Emp emp=empService.findEmpByUser_name(user_name);
        if(emp==null) {
            return new JsonResult("��ѯʧ��");
        }
        return new JsonResult(emp);
    }
 
 
}

