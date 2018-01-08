package service.set;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.set.DeptDAO;
import entity.ADO.QueryDept;
import entity.set.Dept;

@Service
public class DeptService {
    @Resource(name="deptDAO")
    private DeptDAO deptDAO;
 
    public int addDept(Dept dept) {
        return deptDAO.addDept(dept);
    }
    public int addDepts(List<Dept> list) {
        return deptDAO.addDepts(list);
    }
 
    public int delDept(Integer id) {
        return deptDAO.delDept(id);
    }
    public int delDepts(List<Integer> list) {
        return deptDAO.delDepts(list);
    }
 
    public int updateDept(Dept dept) {
        return deptDAO.updateDept(dept);
    }
    public int updateDepts(List<Dept> list) {
        return deptDAO.updateDepts(list);
    }
 
    public Dept findDeptById(Integer id) {
        return deptDAO.findDeptById(id);
    }
    public Map<String,Object> findDeptByPage(QueryDept queryDept){
        List<Dept> list=deptDAO.findDeptByPage(queryDept);
        int pages =deptDAO.countDeptByPage(queryDept);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("rows", list);
        map.put("total", pages);
        return map;
    }
 
    public Dept findDeptByDept_name(String dept_name) {
        return deptDAO.findDeptByDept_name(dept_name);
    }

}
