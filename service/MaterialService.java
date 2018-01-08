package service.table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.table.MaterialDAO;
import entity.ADO.QueryMaterial;
import entity.table.Material;

@Service
public class MaterialService {
    @Resource(name="materialDAO")
    private MaterialDAO materialDAO;
 
    public int addMaterial(Material material) {
        return materialDAO.addMaterial(material);
    }
    public int addMaterials(List<Material> list) {
        return materialDAO.addMaterials(list);
    }
 
    public int delMaterial(Integer id) {
        return materialDAO.delMaterial(id);
    }
    public int delMaterials(List<Integer> list) {
        return materialDAO.delMaterials(list);
    }
 
    public int updateMaterial(Material material) {
        return materialDAO.updateMaterial(material);
    }
    public int updateMaterials(List<Material> list) {
        return materialDAO.updateMaterials(list);
    }
 
    public Material findMaterialById(Integer id) {
        return materialDAO.findMaterialById(id);
    }
    public Map<String,Object> findMaterialByPage(QueryMaterial queryMaterial){
        List<Material> list=materialDAO.findMaterialByPage(queryMaterial);
        int pages =materialDAO.countMaterialByPage(queryMaterial);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("rows", list);
        map.put("total", pages);
        return map;
    }
 
    public Material findMaterialByContract_addr(String contract_addr) {
        return materialDAO.findMaterialByContract_addr(contract_addr);
    }

}
