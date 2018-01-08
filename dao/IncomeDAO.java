package dao.table;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryIncome;
import entity.table.Income;
@Repository
public interface IncomeDAO {
 //��
 public int addIncome(Income income);
 public int addIncomes(List<Income> list);
 //ɾ
 public int delIncome(Integer id);
 public int delIncomes(List<Integer> list);
 //��
 public int updateIncome(Income income);
 public int updateIncomes(List<Income> List);
 //��
 public Income findIncomeById(Integer id);
 public List<Income> findIncomeByPage(QueryIncome queryIncome);
 public int countIncomeByPage(QueryIncome queryIncome);

 public Income findIncomeByContract_addr (String contract_addr);
}
