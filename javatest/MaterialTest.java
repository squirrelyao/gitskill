package tableTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.table.MaterialDAO;
import entity.ADO.QueryMaterial;
import entity.table.Material;



public class MaterialTest {
    ApplicationContext ac;
    MaterialDAO dao;
  
    @Before
    public void init() {
        ac=new ClassPathXmlApplicationContext("spring-mybatis.xml");
        dao=ac.getBean(MaterialDAO.class);
   
     }
    @Test
    public void addMaterialTest() {
        Material material=new Material();
   
        //set_messages
   
        int a=dao.addMaterial(material);
        System.out.println(a);
   
    }
    @Test
    public void addMaterialsTest() {
        List<Material> list=new ArrayList<Material>();
        for (int i = 0; i < 10; i++) {
            Material material=new Material();
    
            //set_messages
    
            list.add(material);
        }
        int a=dao.addMaterials(list);
        System.out.println(a);
    }
  
    @Test
    public void delMaterialTest() {
        int a= dao.delMaterial(10);
        System.out.println(a);
   
    }
  
    @Test
    public void delMaterialsTest() {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add(8+i);
        }
        int a= dao.delMaterials(list);
        System.out.println(a); 
    }
  
    @Test
    public void updateMaterialTest() {
        Material material=dao.findMaterialById(3);
   
        //set_messages2
   
        int a= dao.updateMaterial(material);
        System.out.println(a);
   
    }
    @Test
    public void updateMaterialsTest() {
        List<Material> list=new ArrayList<Material>();
        for (int i = 1; i <= 5; i++) {
    
            Material material=dao.findMaterialById(3+i);
            if(material!=null) {
     
                //set_messages3
     
                list.add(material);
            }
        }
        int a= dao.updateMaterials(list);
        System.out.println(a); 
    }
  
    @Test
    public void findMaterialByPage() {
        QueryMaterial query=new QueryMaterial();
        query.setStartrows(0);
        query.setPagesize(10);
   
        //set_messages4
    
        List<Material> list=dao.findMaterialByPage(query);
   
        int a=dao.countMaterialByPage(query);
        System.out.println(list);
        System.out.println(a);
   
    }

    @Test
    public void finMaterialByContract_addr() {
        Material material =dao.findMaterialByContract_addr("");
        System.out.println(material);
    }



}

