package entity.tables;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
public class Contract implements Serializable{
     private Integer id;
     private String contract_number;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date contract_date;
     private String contract_addr;
     private Double contract_area;
     private String contract_type;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date contract_starttime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date contract_endtime;
     private Integer limit_time;
     private String customer_name;
     private String customer_phone;
     private String designer;
     private String custodian;
     private String servicer;
     private Integer service_time;
     private Double contract_price;
     private Double contract_total_price;
     private Double management_cost;
     private Double rebate;
     private Double repay;
     private Double first_pay;
     private Double second_pay;
     private Double third_pay;
     private Double last_pay;
     private Double buliding_mterials_second;
     private Double buliding_mterials_third;
     private Double total_pay;
     private Double profit;
     private Integer status;
     private String form_maker;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date last_modify;
}
