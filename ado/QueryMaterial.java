package entity.ADO;

import java.io.Serializable;
public class QueryMaterial implements Serializable{
     private Integer id;
     private String contract_addr;
     private String mat_getway;
     private String mat_name;
     private String mat_factory;
     private String mat_price_sign;//判定大小big or small
     private Double mat_price;
     private String mat_budget_sign;//判定大小big or small
     private Double mat_budget;
     private String note;
    private Integer startrows;
    private Integer pagesize;
    private String orderby;
    private String orderbyDesc;

}