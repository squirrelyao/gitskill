package entity.ADO;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
public class QuerySpend implements Serializable{
     private Integer id;
     private String contract_addr;
     private String spend_project1;
     private String spend_project2;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date spend_date_start;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date spend_date_end;
     private String spend_money_sign;//≈–∂®¥Û–°big or small
     private Double spend_money;
     private String spend_way;
     private String payer;
     private String note;
    private Integer startrows;
    private Integer pagesize;
    private String orderby;
    private String orderbyDesc;

}
