package entity.ADO;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
public class QueryContract implements Serializable{
     private Integer id;
     private String contract_number;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date contract_date_start;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date contract_date_end;
     private String contract_addr;
     private String contract_area_sign;//判定大小big or small
     private Double contract_area;
     private String contract_type;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date contract_starttime_start;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date contract_starttime_end;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date contract_endtime_start;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date contract_endtime_end;
     private String limit_time_sign;//判定大小big or small
     private Integer limit_time;
     private String customer_name;
     private String customer_phone;
     private String designer;
     private String custodian;
     private String servicer;
     private String service_time_sign;//判定大小big or small
     private Integer service_time;
     private String contract_price_sign;//判定大小big or small
     private Double contract_price;
     private String contract_total_price_sign;//判定大小big or small
     private Double contract_total_price;
     private String management_cost_sign;//判定大小big or small
     private Double management_cost;
     private String rebate_sign;//判定大小big or small
     private Double rebate;
     private String repay_sign;//判定大小big or small
     private Double repay;
     private String first_pay_sign;//判定大小big or small
     private Double first_pay;
     private String second_pay_sign;//判定大小big or small
     private Double second_pay;
     private String third_pay_sign;//判定大小big or small
     private Double third_pay;
     private String last_pay_sign;//判定大小big or small
     private Double last_pay;
     private String buliding_mterials_second_sign;//判定大小big or small
     private Double buliding_mterials_second;
     private String buliding_mterials_third_sign;//判定大小big or small
     private Double buliding_mterials_third;
     private String total_pay_sign;//判定大小big or small
     private Double total_pay;
     private String profit_sign;//判定大小big or small
     private Double profit;
     private String status_sign;//判定大小big or small
     private Integer status;
     private String form_maker;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date last_modify_start;
    @DateTimeFormat(pattern="yyyy-MM-dd")
     private Date last_modify_end;
    private Integer startrows;
    private Integer pagesize;
    private String orderby;
    private String orderbyDesc;

}
