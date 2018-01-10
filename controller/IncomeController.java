package controller.table;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.ADO.QueryIncome;
import entity.table.Income;
import myutils.JsonResult;
import service.table.IncomeService;

@Controller
public class IncomeController {
    @Resource(name="incomeService")
    private IncomeService incomeService;
 
    @RequestMapping("income_index_load.do")
    public String income_index_load() {
        return "table/income_index";
    }
 
    @RequestMapping("income_page_load.do")
    public String income_page_load() {
        return "table/page/income_page";
    }

    @RequestMapping("income_add.do")
    @ResponseBody
    public JsonResult income_add(Income income) {
        if(income==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=incomeService.addIncome(income);
        if(result_number!=1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("income_adds.do")
    @ResponseBody
    public JsonResult income_adds(List<Income> list) {
        if(list==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=incomeService.addIncomes(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("income_del.do")
    @ResponseBody
    public JsonResult income_del(Integer id) {
        if(id==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=incomeService.delIncome(id);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("income_dels.do")
    @ResponseBody
    public JsonResult income_dels(List<Integer> list) {
        if(list==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=incomeService.delIncomes(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("income_update.do")
    @ResponseBody
    public JsonResult income_update(Income income) {
        if(income==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=incomeService.updateIncome(income);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("income_updates.do")
    @ResponseBody
    public JsonResult income_updates(List<Income> list) {
        if(list==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=incomeService.updateIncomes(list);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("income_findById.do")
    @ResponseBody
    public JsonResult income_findById(Integer id) {
        if(id==null) {
            return new JsonResult("查询对象不能为空");
        }
        Income income=incomeService.findIncomeById(id);
        if(income==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(income);
    }
 
    @RequestMapping("income_findByPage.do")
    @ResponseBody
    public JsonResult income_findByPage(QueryIncome queryIncome) {
        if(queryIncome==null) {
            return new JsonResult("查询对象不能为空");
        }
        Map<String,Object> map=incomeService.findIncomeByPage(queryIncome);
        if(map==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(map);
    }
 

    @RequestMapping("income_findByContract_addr.do")
    @ResponseBody
    public JsonResult income_findByContract_addr(String contract_addr) {
        if(contract_addr==null) {
            return new JsonResult("查询对象不能为空");
        }
        Income income=incomeService.findIncomeByContract_addr(contract_addr);
        if(income==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(income);
    }
 
 
}
