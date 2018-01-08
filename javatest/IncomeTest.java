package tableTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.table.IncomeDAO;
import entity.ADO.QueryIncome;
import entity.table.Income;



public class IncomeTest {
    ApplicationContext ac;
    IncomeDAO dao;
  
    @Before
    public void init() {
        ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        dao=ac.getBean(IncomeDAO.class);
   
     }
    @Test
    public void addIncomeTest() {
        Income income=new Income();
   
        //set_messages
   
        int a=dao.addIncome(income);
        System.out.println(a);
   
    }
    @Test
    public void addIncomesTest() {
        List<Income> list=new ArrayList<Income>();
        for (int i = 0; i < 10; i++) {
            Income income=new Income();
    
            //set_messages
    
            list.add(income);
        }
        int a=dao.addIncomes(list);
        System.out.println(a);
    }
  
    @Test
    public void delIncomeTest() {
        int a= dao.delIncome(10);
        System.out.println(a);
   
    }
  
    @Test
    public void delIncomesTest() {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add(8+i);
        }
        int a= dao.delIncomes(list);
        System.out.println(a); 
    }
  
    @Test
    public void updateIncomeTest() {
        Income income=dao.findIncomeById(3);
   
        //set_messages2
   
        int a= dao.updateIncome(income);
        System.out.println(a);
   
    }
    @Test
    public void updateIncomesTest() {
        List<Income> list=new ArrayList<Income>();
        for (int i = 1; i <= 5; i++) {
    
            Income income=dao.findIncomeById(3+i);
            if(income!=null) {
     
                //set_messages3
     
                list.add(income);
            }
        }
        int a= dao.updateIncomes(list);
        System.out.println(a); 
    }
  
    @Test
    public void findIncomeByPage() {
        QueryIncome query=new QueryIncome();
        query.setStartrows(0);
        query.setPagesize(10);
   
        //set_messages4
    
        List<Income> list=dao.findIncomeByPage(query);
   
        int a=dao.countIncomeByPage(query);
        System.out.println(list);
        System.out.println(a);
   
    }

    @Test
    public void finIncomeByContract_addr() {
        Income income =dao.findIncomeByContract_addr("");
        System.out.println(income);
    }



}

