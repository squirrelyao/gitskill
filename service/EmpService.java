package service.set;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.set.EmpDAO;
import entity.ADO.QueryEmp;
import entity.set.Emp;

@Service
public class EmpService {
    @Resource(name="empDAO")
    private EmpDAO empDAO;
 
    public int addEmp(Emp emp) {
        return empDAO.addEmp(emp);
    }
    public int addEmps(List<Emp> list) {
        return empDAO.addEmps(list);
    }
 
    public int delEmp(Integer id) {
        return empDAO.delEmp(id);
    }
    public int delEmps(List<Integer> list) {
        return empDAO.delEmps(list);
    }
 
    public int updateEmp(Emp emp) {
        return empDAO.updateEmp(emp);
    }
    public int updateEmps(List<Emp> list) {
        return empDAO.updateEmps(list);
    }
 
    public Emp findEmpById(Integer id) {
        return empDAO.findEmpById(id);
    }
    public Map<String,Object> findEmpByPage(QueryEmp queryEmp){
        List<Emp> list=empDAO.findEmpByPage(queryEmp);
        int pages =empDAO.countEmpByPage(queryEmp);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("rows", list);
        map.put("total", pages);
        return map;
    }
 
    public Emp findEmpByEmp_name(String emp_name) {
        return empDAO.findEmpByEmp_name(emp_name);
    }    public Emp findEmpByUser_name(String user_name) {
        return empDAO.findEmpByUser_name(user_name);
    }

}
