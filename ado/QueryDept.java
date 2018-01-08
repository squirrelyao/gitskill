package entity.ADO;

import java.io.Serializable;
public class QueryDept implements Serializable{
     private Integer id;
     private String dept_name;
    private Integer startrows;
    private Integer pagesize;
    private String orderby;
    private String orderbyDesc;

}
