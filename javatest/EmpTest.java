package setTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.set.EmpDAO;
import entity.ADO.QueryEmp;
import entity.set.Emp;



public class EmpTest {
    ApplicationContext ac;
    EmpDAO dao;
  
    @Before
    public void init() {
        ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        dao=ac.getBean(EmpDAO.class);
   
     }
    @Test
    public void addEmpTest() {
        Emp emp=new Emp();
   
        //set_messages
   
        int a=dao.addEmp(emp);
        System.out.println(a);
   
    }
    @Test
    public void addEmpsTest() {
        List<Emp> list=new ArrayList<Emp>();
        for (int i = 0; i < 10; i++) {
            Emp emp=new Emp();
    
            //set_messages
    
            list.add(emp);
        }
        int a=dao.addEmps(list);
        System.out.println(a);
    }
  
    @Test
    public void delEmpTest() {
        int a= dao.delEmp(10);
        System.out.println(a);
   
    }
  
    @Test
    public void delEmpsTest() {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add(8+i);
        }
        int a= dao.delEmps(list);
        System.out.println(a); 
    }
  
    @Test
    public void updateEmpTest() {
        Emp emp=dao.findEmpById(3);
   
        //set_messages2
   
        int a= dao.updateEmp(emp);
        System.out.println(a);
   
    }
    @Test
    public void updateEmpsTest() {
        List<Emp> list=new ArrayList<Emp>();
        for (int i = 1; i <= 5; i++) {
    
            Emp emp=dao.findEmpById(3+i);
            if(emp!=null) {
     
                //set_messages3
     
                list.add(emp);
            }
        }
        int a= dao.updateEmps(list);
        System.out.println(a); 
    }
  
    @Test
    public void findEmpByPage() {
        QueryEmp query=new QueryEmp();
        query.setStartrows(0);
        query.setPagesize(10);
   
        //set_messages4
    
        List<Emp> list=dao.findEmpByPage(query);
   
        int a=dao.countEmpByPage(query);
        System.out.println(list);
        System.out.println(a);
   
    }

    @Test
    public void finEmpByEmp_name() {
        Emp emp =dao.findEmpByEmp_name("");
        System.out.println(emp);
    }


    @Test
    public void finEmpByUser_name() {
        Emp emp =dao.findEmpByUser_name("");
        System.out.println(emp);
    }



}

