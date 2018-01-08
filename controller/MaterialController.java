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
 
    @RequestMapping("material_page_load.do")
    public String material_page_load() {
        return "table/material_index";
    }
 
    @RequestMapping("material_add.do")
    @ResponseBody
    public JsonResult material_add(Material material) {
        if(material==null) {
            return new JsonResult("���������Ϊ��");
        }
        int result_number=materialService.addMaterial(material);
        if(result_number!=1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("����ɹ�");
    }
 
    @RequestMapping("material_adds.do")
    @ResponseBody
    public JsonResult material_adds(List<Material> list) {
        if(list==null) {
            return new JsonResult("���������Ϊ��");
        }
        int result_number=materialService.addMaterials(list);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("����ɹ�");
    }
 
    @RequestMapping("material_del.do")
    @ResponseBody
    public JsonResult material_del(Integer id) {
        if(id==null) {
            return new JsonResult("ɾ��������Ϊ��");
        }
        int result_number=materialService.delMaterial(id);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("����ɹ�");
    }
 
    @RequestMapping("material_dels.do")
    @ResponseBody
    public JsonResult material_dels(List<Integer> list) {
        if(list==null) {
            return new JsonResult("ɾ��������Ϊ��");
        }
        int result_number=materialService.delMaterials(list);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("����ɹ�");
    }
 
    @RequestMapping("material_update.do")
    @ResponseBody
    public JsonResult material_update(Material material) {
        if(material==null) {
            return new JsonResult("���¶�����Ϊ��");
        }
        int result_number=materialService.updateMaterial(material);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("���³ɹ�");
    }
 
    @RequestMapping("material_updates.do")
    @ResponseBody
    public JsonResult material_updates(List<Material> list) {
        if(list==null) {
            return new JsonResult("���¶�����Ϊ��");
        }
        int result_number=materialService.updateMaterials(list);
        if(result_number<1) {
            return new JsonResult("����ʧ��");
        }
        return new JsonResult("���³ɹ�");
    }
 
    @RequestMapping("material_findById.do")
    @ResponseBody
    public JsonResult material_findById(Integer id) {
        if(id==null) {
            return new JsonResult("��ѯ������Ϊ��");
        }
        Material material=materialService.findMaterialById(id);
        if(material==null) {
            return new JsonResult("��ѯʧ��");
        }
        return new JsonResult(material);
    }
 
    @RequestMapping("material_findByPage.do")
    @ResponseBody
    public JsonResult material_findByPage(QueryMaterial queryMaterial) {
        if(queryMaterial==null) {
            return new JsonResult("��ѯ������Ϊ��");
        }
        Map<String,Object> map=materialService.findMaterialByPage(queryMaterial);
        if(map==null) {
            return new JsonResult("��ѯʧ��");
        }
        return new JsonResult(map);
    }
 

    @RequestMapping("material_findByContract_addr.do")
    @ResponseBody
    public JsonResult material_findByContract_addr(String contract_addr) {
        if(contract_addr==null) {
            return new JsonResult("��ѯ������Ϊ��");
        }
        Material material=materialService.findMaterialByContract_addr(contract_addr);
        if(material==null) {
            return new JsonResult("��ѯʧ��");
        }
        return new JsonResult(material);
    }
 
 
}

