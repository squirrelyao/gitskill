package entity.table;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
public class Spend implements Serializable{
     private Integer id;
     private String contract_addr;
     private String spend_project1;
     private String spend_project2;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date spend_date;
     private Double spend_money;
     private String spend_way;
     private String payer;
     private String note;
}
