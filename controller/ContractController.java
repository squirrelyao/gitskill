package controller.table;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.ADO.QueryContract;
import entity.table.Contract;
import myutils.JsonResult;
import service.table.ContractService;

@Controller
public class ContractController {
    @Resource(name="contractService")
    private ContractService contractService;
 
    @RequestMapping("contract_page_load.do")
    public String contract_page_load() {
        return "table/contract_index";
    }
 
    @RequestMapping("contract_add.do")
    @ResponseBody
    public JsonResult contract_add(Contract contract) {
        if(contract==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=contractService.addContract(contract);
        if(result_number!=1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("contract_adds.do")
    @ResponseBody
    public JsonResult contract_adds(List<Contract> list) {
        if(list==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=contractService.addContracts(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("contract_del.do")
    @ResponseBody
    public JsonResult contract_del(Integer id) {
        if(id==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=contractService.delContract(id);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("contract_dels.do")
    @ResponseBody
    public JsonResult contract_dels(List<Integer> list) {
        if(list==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=contractService.delContracts(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("contract_update.do")
    @ResponseBody
    public JsonResult contract_update(Contract contract) {
        if(contract==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=contractService.updateContract(contract);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("contract_updates.do")
    @ResponseBody
    public JsonResult contract_updates(List<Contract> list) {
        if(list==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=contractService.updateContracts(list);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("contract_findById.do")
    @ResponseBody
    public JsonResult contract_findById(Integer id) {
        if(id==null) {
            return new JsonResult("查询对象不能为空");
        }
        Contract contract=contractService.findContractById(id);
        if(contract==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(contract);
    }
 
    @RequestMapping("contract_findByPage.do")
    @ResponseBody
    public JsonResult contract_findByPage(QueryContract queryContract) {
        if(queryContract==null) {
            return new JsonResult("查询对象不能为空");
        }
        Map<String,Object> map=contractService.findContractByPage(queryContract);
        if(map==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(map);
    }
 

    @RequestMapping("contract_findByContract_number.do")
    @ResponseBody
    public JsonResult contract_findByContract_number(String contract_number) {
        if(contract_number==null) {
            return new JsonResult("查询对象不能为空");
        }
        Contract contract=contractService.findContractByContract_number(contract_number);
        if(contract==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(contract);
    }
 
 
}

