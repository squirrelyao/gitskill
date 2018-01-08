package service.table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.table.IncomeDAO;
import entity.ADO.QueryIncome;
import entity.table.Income;

@Service
public class IncomeService {
    @Resource(name="incomeDAO")
    private IncomeDAO incomeDAO;
 
    public int addIncome(Income income) {
        return incomeDAO.addIncome(income);
    }
    public int addIncomes(List<Income> list) {
        return incomeDAO.addIncomes(list);
    }
 
    public int delIncome(Integer id) {
        return incomeDAO.delIncome(id);
    }
    public int delIncomes(List<Integer> list) {
        return incomeDAO.delIncomes(list);
    }
 
    public int updateIncome(Income income) {
        return incomeDAO.updateIncome(income);
    }
    public int updateIncomes(List<Income> list) {
        return incomeDAO.updateIncomes(list);
    }
 
    public Income findIncomeById(Integer id) {
        return incomeDAO.findIncomeById(id);
    }
    public Map<String,Object> findIncomeByPage(QueryIncome queryIncome){
        List<Income> list=incomeDAO.findIncomeByPage(queryIncome);
        int pages =incomeDAO.countIncomeByPage(queryIncome);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("rows", list);
        map.put("total", pages);
        return map;
    }
 
    public Income findIncomeByContract_addr(String contract_addr) {
        return incomeDAO.findIncomeByContract_addr(contract_addr);
    }

}
