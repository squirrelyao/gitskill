package dao.set;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryDept;
import entity.set.Dept;
@Repository
public interface DeptDAO {
 //增
 public int addDept(Dept dept);
 public int addDepts(List<Dept> list);
 //删
 public int delDept(Integer id);
 public int delDepts(List<Integer> list);
 //改
 public int updateDept(Dept dept);
 public int updateDepts(List<Dept> List);
 //查
 public Dept findDeptById(Integer id);
 public List<Dept> findDeptByPage(QueryDept queryDept);
 public int countDeptByPage(QueryDept queryDept);

 public Dept findDeptByDept_name (String dept_name);
}