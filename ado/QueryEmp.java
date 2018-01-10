package entity.ADO;

import java.io.Serializable;
public class QueryEmp implements Serializable{
     private Integer id;
     private String emp_name;
     private String dept_id_sign;//判定大小big or small
     private Integer dept_id;
     private String master_id_sign;//判定大小big or small
     private Integer master_id;
     private String user_name;
     private String password;
    private Integer startrows;
    private Integer pagesize;
    private String orderby;
    private String orderbyDesc;

}