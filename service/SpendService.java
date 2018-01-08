package service.table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.table.SpendDAO;
import entity.ADO.QuerySpend;
import entity.table.Spend;

@Service
public class SpendService {
    @Resource(name="spendDAO")
    private SpendDAO spendDAO;
 
    public int addSpend(Spend spend) {
        return spendDAO.addSpend(spend);
    }
    public int addSpends(List<Spend> list) {
        return spendDAO.addSpends(list);
    }
 
    public int delSpend(Integer id) {
        return spendDAO.delSpend(id);
    }
    public int delSpends(List<Integer> list) {
        return spendDAO.delSpends(list);
    }
 
    public int updateSpend(Spend spend) {
        return spendDAO.updateSpend(spend);
    }
    public int updateSpends(List<Spend> list) {
        return spendDAO.updateSpends(list);
    }
 
    public Spend findSpendById(Integer id) {
        return spendDAO.findSpendById(id);
    }
    public Map<String,Object> findSpendByPage(QuerySpend querySpend){
        List<Spend> list=spendDAO.findSpendByPage(querySpend);
        int pages =spendDAO.countSpendByPage(querySpend);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("rows", list);
        map.put("total", pages);
        return map;
    }
 
    public Spend findSpendByContract_addr(String contract_addr) {
        return spendDAO.findSpendByContract_addr(contract_addr);
    }

}
