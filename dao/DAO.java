package dao.set;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryEmp;
import entity.set.Emp;
@Repository
public interface EmpDAO {
 //增
 public int addEmp(Emp emp);
 public int addEmps(List<Emp> list);
 //删
 public int delEmp(Integer id);
 public int delEmps(List<Integer> list);
 //改
 public int updateEmp(Emp emp);
 public int updateEmps(List<Emp> List);
 //查
 public Emp findEmpById(Integer id);
 public List<Emp> findEmpByPage(QueryEmp queryEmp);
 public int countEmpByPage(QueryEmp queryEmp);

 public Emp findEmpByEmp_name (String emp_name);
 public Emp findEmpByUser_name (String user_name);
}