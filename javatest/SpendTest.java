package tableTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.table.SpendDAO;
import entity.ADO.QuerySpend;
import entity.table.Spend;



public class SpendTest {
    ApplicationContext ac;
    SpendDAO dao;
  
    @Before
    public void init() {
        ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        dao=ac.getBean(SpendDAO.class);
   
     }
    @Test
    public void addSpendTest() {
        Spend spend=new Spend();
   
        //set_messages
   
        int a=dao.addSpend(spend);
        System.out.println(a);
   
    }
    @Test
    public void addSpendsTest() {
        List<Spend> list=new ArrayList<Spend>();
        for (int i = 0; i < 10; i++) {
            Spend spend=new Spend();
    
            //set_messages
    
            list.add(spend);
        }
        int a=dao.addSpends(list);
        System.out.println(a);
    }
  
    @Test
    public void delSpendTest() {
        int a= dao.delSpend(10);
        System.out.println(a);
   
    }
  
    @Test
    public void delSpendsTest() {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add(8+i);
        }
        int a= dao.delSpends(list);
        System.out.println(a); 
    }
  
    @Test
    public void updateSpendTest() {
        Spend spend=dao.findSpendById(3);
   
        //set_messages2
   
        int a= dao.updateSpend(spend);
        System.out.println(a);
   
    }
    @Test
    public void updateSpendsTest() {
        List<Spend> list=new ArrayList<Spend>();
        for (int i = 1; i <= 5; i++) {
    
            Spend spend=dao.findSpendById(3+i);
            if(spend!=null) {
     
                //set_messages3
     
                list.add(spend);
            }
        }
        int a= dao.updateSpends(list);
        System.out.println(a); 
    }
  
    @Test
    public void findSpendByPage() {
        QuerySpend query=new QuerySpend();
        query.setStartrows(0);
        query.setPagesize(10);
   
        //set_messages4
    
        List<Spend> list=dao.findSpendByPage(query);
   
        int a=dao.countSpendByPage(query);
        System.out.println(list);
        System.out.println(a);
   
    }

    @Test
    public void finSpendByContract_addr() {
        Spend spend =dao.findSpendByContract_addr("");
        System.out.println(spend);
    }



}

