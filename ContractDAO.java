package dao.tables;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryContract;
import entity.tables.Contract;
@Repository
public interface ContractDAO {
 //Ôö
 public int addContract(Contract contract);
 public int addContracts(List<Contract> list);
 //É¾
 public int delContract(Integer id);
 public int delContracts(List<Integer> list);
 //¸Ä
 public int updateContract(Contract contract);
 public int updateContracts(List<Contract> List);
 //²é
 public Contract findContractById(Integer id);
 public List<Contract> findContractByPage(QueryContract queryContract);
 public int countContractByPage(QueryContract queryContract);

}
