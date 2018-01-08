package entity.ADO;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
public class QueryIncome implements Serializable{
     private Integer id;
     private String contract_addr;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date collection_date_start;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date collection_date_end;
     private String collection_project;
     private String collection_money_sign;//判定大小big or small
     private Double collection_money;
     private String get_way;
     private String rebate_sign;//判定大小big or small
     private Double rebate;
     private String payee;
     private String note;
    private Integer startrows;
    private Integer pagesize;
    private String orderby;
    private String orderbyDesc;

}
