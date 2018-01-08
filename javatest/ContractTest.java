package tableTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.table.ContractDAO;
import entity.ADO.QueryContract;
import entity.table.Contract;



public class ContractTest {
    ApplicationContext ac;
    ContractDAO dao;
  
    @Before
    public void init() {
        ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        dao=ac.getBean(ContractDAO.class);
   
     }
    @Test
    public void addContractTest() {
        Contract contract=new Contract();
   
        //set_messages
   
        int a=dao.addContract(contract);
        System.out.println(a);
   
    }
    @Test
    public void addContractsTest() {
        List<Contract> list=new ArrayList<Contract>();
        for (int i = 0; i < 10; i++) {
            Contract contract=new Contract();
    
            //set_messages
    
            list.add(contract);
        }
        int a=dao.addContracts(list);
        System.out.println(a);
    }
  
    @Test
    public void delContractTest() {
        int a= dao.delContract(10);
        System.out.println(a);
   
    }
  
    @Test
    public void delContractsTest() {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add(8+i);
        }
        int a= dao.delContracts(list);
        System.out.println(a); 
    }
  
    @Test
    public void updateContractTest() {
        Contract contract=dao.findContractById(3);
   
        //set_messages2
   
        int a= dao.updateContract(contract);
        System.out.println(a);
   
    }
    @Test
    public void updateContractsTest() {
        List<Contract> list=new ArrayList<Contract>();
        for (int i = 1; i <= 5; i++) {
    
            Contract contract=dao.findContractById(3+i);
            if(contract!=null) {
     
                //set_messages3
     
                list.add(contract);
            }
        }
        int a= dao.updateContracts(list);
        System.out.println(a); 
    }
  
    @Test
    public void findContractByPage() {
        QueryContract query=new QueryContract();
        query.setStartrows(0);
        query.setPagesize(10);
   
        //set_messages4
    
        List<Contract> list=dao.findContractByPage(query);
   
        int a=dao.countContractByPage(query);
        System.out.println(list);
        System.out.println(a);
   
    }

    @Test
    public void finContractByContract_number() {
        Contract contract =dao.findContractByContract_number("");
        System.out.println(contract);
    }



}

