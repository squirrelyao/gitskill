package dao.table;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QuerySpend;
import entity.table.Spend;
@Repository
public interface SpendDAO {
 //��
 public int addSpend(Spend spend);
 public int addSpends(List<Spend> list);
 //ɾ
 public int delSpend(Integer id);
 public int delSpends(List<Integer> list);
 //��
 public int updateSpend(Spend spend);
 public int updateSpends(List<Spend> List);
 //��
 public Spend findSpendById(Integer id);
 public List<Spend> findSpendByPage(QuerySpend querySpend);
 public int countSpendByPage(QuerySpend querySpend);

 public Spend findSpendByContract_addr (String contract_addr);
}
