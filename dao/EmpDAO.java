package dao.set;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryEmp;
import entity.set.Emp;
@Repository
public interface EmpDAO {
 //��
 public int addEmp(Emp emp);
 public int addEmps(List<Emp> list);
 //ɾ
 public int delEmp(Integer id);
 public int delEmps(List<Integer> list);
 //��
 public int updateEmp(Emp emp);
 public int updateEmps(List<Emp> List);
 //��
 public Emp findEmpById(Integer id);
 public List<Emp> findEmpByPage(QueryEmp queryEmp);
 public int countEmpByPage(QueryEmp queryEmp);

 public Emp findEmpByEmp_name (String emp_name);
}
