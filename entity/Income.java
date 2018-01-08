package entity.table;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
public class Income implements Serializable{
     private Integer id;
     private String contract_addr;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date collection_date;
     private String collection_project;
     private Double collection_money;
     private String get_way;
     private Double rebate;
     private String payee;
     private String note;
}
