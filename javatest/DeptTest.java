package setTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.set.DeptDAO;
import entity.ADO.QueryDept;
import entity.set.Dept;



public class DeptTest {
    ApplicationContext ac;
    DeptDAO dao;
  
    @Before
    public void init() {
        ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        dao=ac.getBean(DeptDAO.class);
   
     }
    @Test
    public void addDeptTest() {
        Dept dept=new Dept();
   
        //set_messages
   
        int a=dao.addDept(dept);
        System.out.println(a);
   
    }
    @Test
    public void addDeptsTest() {
        List<Dept> list=new ArrayList<Dept>();
        for (int i = 0; i < 10; i++) {
            Dept dept=new Dept();
    
            //set_messages
    
            list.add(dept);
        }
        int a=dao.addDepts(list);
        System.out.println(a);
    }
  
    @Test
    public void delDeptTest() {
        int a= dao.delDept(10);
        System.out.println(a);
   
    }
  
    @Test
    public void delDeptsTest() {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add(8+i);
        }
        int a= dao.delDepts(list);
        System.out.println(a); 
    }
  
    @Test
    public void updateDeptTest() {
        Dept dept=dao.findDeptById(3);
   
        //set_messages2
   
        int a= dao.updateDept(dept);
        System.out.println(a);
   
    }
    @Test
    public void updateDeptsTest() {
        List<Dept> list=new ArrayList<Dept>();
        for (int i = 1; i <= 5; i++) {
    
            Dept dept=dao.findDeptById(3+i);
            if(dept!=null) {
     
                //set_messages3
     
                list.add(dept);
            }
        }
        int a= dao.updateDepts(list);
        System.out.println(a); 
    }
  
    @Test
    public void findDeptByPage() {
        QueryDept query=new QueryDept();
        query.setStartrows(0);
        query.setPagesize(10);
   
        //set_messages4
    
        List<Dept> list=dao.findDeptByPage(query);
   
        int a=dao.countDeptByPage(query);
        System.out.println(list);
        System.out.println(a);
   
    }

    @Test
    public void finDeptByDept_name() {
        Dept dept =dao.findDeptByDept_name("");
        System.out.println(dept);
    }



}

