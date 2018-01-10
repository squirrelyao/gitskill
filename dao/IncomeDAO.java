package dao.table;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryIncome;
import entity.table.Income;
@Repository
public interface IncomeDAO {
 //增
 public int addIncome(Income income);
 public int addIncomes(List<Income> list);
 //删
 public int delIncome(Integer id);
 public int delIncomes(List<Integer> list);
 //改
 public int updateIncome(Income income);
 public int updateIncomes(List<Income> List);
 //查
 public Income findIncomeById(Integer id);
 public List<Income> findIncomeByPage(QueryIncome queryIncome);
 public int countIncomeByPage(QueryIncome queryIncome);

 public Income findIncomeByContract_addr (String contract_addr);
}