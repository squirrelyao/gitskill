package pakgeTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.pakge.EntityDAO;
import entity.ADO.QueryEntity;
import entity.pakge.Entity;



public class EntityTest {
    ApplicationContext ac;
    EntityDAO dao;
  
    @Before
    public void init() {
        ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        dao=ac.getBean(EntityDAO.class);
   
     }
    @Test
    public void addEntityTest() {
        Entity entity_name=new Entity();
   
        //set_messages
   
        int a=dao.addEntity(entity_name);
        System.out.println(a);
   
    }
    @Test
    public void addEntitysTest() {
        List<Entity> list=new ArrayList<Entity>();
        for (int i = 0; i < 10; i++) {
            Entity entity_name=new Entity();
    
            //set_messages
    
            list.add(entity_name);
        }
        int a=dao.addEntitys(list);
        System.out.println(a);
    }
  
    @Test
    public void delEntityTest() {
        int a= dao.delEntity(10);
        System.out.println(a);
   
    }
  
    @Test
    public void delEntitysTest() {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add(8+i);
        }
        int a= dao.delEntitys(list);
        System.out.println(a); 
    }
  
    @Test
    public void updateEntityTest() {
        Entity entity_name=dao.findEntityById(3);
   
        //set_messages2
   
        int a= dao.updateEntity(entity_name);
        System.out.println(a);
   
    }
    @Test
    public void updateEntitysTest() {
        List<Entity> list=new ArrayList<Entity>();
        for (int i = 1; i <= 5; i++) {
    
            Entity entity_name=dao.findEntityById(3+i);
            if(entity_name!=null) {
     
                //set_messages3
     
                list.add(entity_name);
            }
        }
        int a= dao.updateEntitys(list);
        System.out.println(a); 
    }
  
    @Test
    public void findEntityBuPage() {
        QueryEntity query=new QueryEntity();
        query.setStartrows(0);
        query.setPagesize(10);
   
        //set_messages4
    
        List<Entity> list=dao.findEntityByPage(query);
   
        int a=dao.countEntityByPage(query);
        System.out.println(list);
        System.out.println(a);
   
    }
}
