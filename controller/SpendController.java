package controller.table;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.ADO.QuerySpend;
import entity.table.Spend;
import myutils.JsonResult;
import service.table.SpendService;

@Controller
public class SpendController {
    @Resource(name="spendService")
    private SpendService spendService;
 
    @RequestMapping("spend_page_load.do")
    public String spend_page_load() {
        return "table/spend_index";
    }
 
    @RequestMapping("spend_add.do")
    @ResponseBody
    public JsonResult spend_add(Spend spend) {
        if(spend==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=spendService.addSpend(spend);
        if(result_number!=1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("spend_adds.do")
    @ResponseBody
    public JsonResult spend_adds(List<Spend> list) {
        if(list==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=spendService.addSpends(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("spend_del.do")
    @ResponseBody
    public JsonResult spend_del(Integer id) {
        if(id==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=spendService.delSpend(id);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("spend_dels.do")
    @ResponseBody
    public JsonResult spend_dels(List<Integer> list) {
        if(list==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=spendService.delSpends(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("spend_update.do")
    @ResponseBody
    public JsonResult spend_update(Spend spend) {
        if(spend==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=spendService.updateSpend(spend);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("spend_updates.do")
    @ResponseBody
    public JsonResult spend_updates(List<Spend> list) {
        if(list==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=spendService.updateSpends(list);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("spend_findById.do")
    @ResponseBody
    public JsonResult spend_findById(Integer id) {
        if(id==null) {
            return new JsonResult("查询对象不能为空");
        }
        Spend spend=spendService.findSpendById(id);
        if(spend==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(spend);
    }
 
    @RequestMapping("spend_findByPage.do")
    @ResponseBody
    public JsonResult spend_findByPage(QuerySpend querySpend) {
        if(querySpend==null) {
            return new JsonResult("查询对象不能为空");
        }
        Map<String,Object> map=spendService.findSpendByPage(querySpend);
        if(map==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(map);
    }
 

    @RequestMapping("spend_findByContract_addr.do")
    @ResponseBody
    public JsonResult spend_findByContract_addr(String contract_addr) {
        if(contract_addr==null) {
            return new JsonResult("查询对象不能为空");
        }
        Spend spend=spendService.findSpendByContract_addr(contract_addr);
        if(spend==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(spend);
    }
 
 
}

