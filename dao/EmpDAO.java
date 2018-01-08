package dao.set;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryEmp;
import entity.set.Emp;
@Repository
public interface EmpDAO {
 //Ôö
 public int addEmp(Emp emp);
 public int addEmps(List<Emp> list);
 //É¾
 public int delEmp(Integer id);
 public int delEmps(List<Integer> list);
 //¸Ä
 public int updateEmp(Emp emp);
 public int updateEmps(List<Emp> List);
 //²é
 public Emp findEmpById(Integer id);
 public List<Emp> findEmpByPage(QueryEmp queryEmp);
 public int countEmpByPage(QueryEmp queryEmp);

 public Emp findEmpByEmp_name (String emp_name);
}
