package service.table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.table.ContractDAO;
import entity.ADO.QueryContract;
import entity.table.Contract;

@Service
public class ContractService {
    @Resource(name="contractDAO")
    private ContractDAO contractDAO;
 
    public int addContract(Contract contract) {
        return contractDAO.addContract(contract);
    }
    public int addContracts(List<Contract> list) {
        return contractDAO.addContracts(list);
    }
 
    public int delContract(Integer id) {
        return contractDAO.delContract(id);
    }
    public int delContracts(List<Integer> list) {
        return contractDAO.delContracts(list);
    }
 
    public int updateContract(Contract contract) {
        return contractDAO.updateContract(contract);
    }
    public int updateContracts(List<Contract> list) {
        return contractDAO.updateContracts(list);
    }
 
    public Contract findContractById(Integer id) {
        return contractDAO.findContractById(id);
    }
    public Map<String,Object> findContractByPage(QueryContract queryContract){
        List<Contract> list=contractDAO.findContractByPage(queryContract);
        int pages =contractDAO.countContractByPage(queryContract);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("rows", list);
        map.put("total", pages);
        return map;
    }
 
    public Contract findContractByContract_number(String contract_number) {
        return contractDAO.findContractByContract_number(contract_number);
    }    public Contract findContractByContract_addr(String contract_addr) {
        return contractDAO.findContractByContract_addr(contract_addr);
    }

}