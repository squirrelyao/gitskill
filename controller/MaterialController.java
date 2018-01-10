package controller.table;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.ADO.QueryMaterial;
import entity.table.Material;
import myutils.JsonResult;
import service.table.MaterialService;

@Controller
public class MaterialController {
    @Resource(name="materialService")
    private MaterialService materialService;
 
    @RequestMapping("material_index_load.do")
    public String material_index_load() {
        return "table/material_index";
    }
 
    @RequestMapping("material_page_load.do")
    public String material_page_load() {
        return "table/page/material_page";
    }

    @RequestMapping("material_add.do")
    @ResponseBody
    public JsonResult material_add(Material material) {
        if(material==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=materialService.addMaterial(material);
        if(result_number!=1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("material_adds.do")
    @ResponseBody
    public JsonResult material_adds(List<Material> list) {
        if(list==null) {
            return new JsonResult("保存对象不能为空");
        }
        int result_number=materialService.addMaterials(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("material_del.do")
    @ResponseBody
    public JsonResult material_del(Integer id) {
        if(id==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=materialService.delMaterial(id);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("material_dels.do")
    @ResponseBody
    public JsonResult material_dels(List<Integer> list) {
        if(list==null) {
            return new JsonResult("删除对象不能为空");
        }
        int result_number=materialService.delMaterials(list);
        if(result_number<1) {
            return new JsonResult("保存失败");
        }
        return new JsonResult("保存成功");
    }
 
    @RequestMapping("material_update.do")
    @ResponseBody
    public JsonResult material_update(Material material) {
        if(material==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=materialService.updateMaterial(material);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("material_updates.do")
    @ResponseBody
    public JsonResult material_updates(List<Material> list) {
        if(list==null) {
            return new JsonResult("更新对象不能为空");
        }
        int result_number=materialService.updateMaterials(list);
        if(result_number<1) {
            return new JsonResult("更新失败");
        }
        return new JsonResult("更新成功");
    }
 
    @RequestMapping("material_findById.do")
    @ResponseBody
    public JsonResult material_findById(Integer id) {
        if(id==null) {
            return new JsonResult("查询对象不能为空");
        }
        Material material=materialService.findMaterialById(id);
        if(material==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(material);
    }
 
    @RequestMapping("material_findByPage.do")
    @ResponseBody
    public JsonResult material_findByPage(QueryMaterial queryMaterial) {
        if(queryMaterial==null) {
            return new JsonResult("查询对象不能为空");
        }
        Map<String,Object> map=materialService.findMaterialByPage(queryMaterial);
        if(map==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(map);
    }
 

    @RequestMapping("material_findByContract_addr.do")
    @ResponseBody
    public JsonResult material_findByContract_addr(String contract_addr) {
        if(contract_addr==null) {
            return new JsonResult("查询对象不能为空");
        }
        Material material=materialService.findMaterialByContract_addr(contract_addr);
        if(material==null) {
            return new JsonResult("查询失败");
        }
        return new JsonResult(material);
    }
 
 
}
