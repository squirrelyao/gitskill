package dao.table;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryContract;
import entity.table.Contract;
@Repository
public interface ContractDAO {
 //增
 public int addContract(Contract contract);
 public int addContracts(List<Contract> list);
 //删
 public int delContract(Integer id);
 public int delContracts(List<Integer> list);
 //改
 public int updateContract(Contract contract);
 public int updateContracts(List<Contract> List);
 //查
 public Contract findContractById(Integer id);
 public List<Contract> findContractByPage(QueryContract queryContract);
 public int countContractByPage(QueryContract queryContract);

 public Contract findContractByContract_number (String contract_number);
 public Contract findContractByContract_addr (String contract_addr);
}