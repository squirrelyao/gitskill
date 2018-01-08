package dao.table;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryMaterial;
import entity.table.Material;
@Repository
public interface MaterialDAO {
 //Ôö
 public int addMaterial(Material material);
 public int addMaterials(List<Material> list);
 //É¾
 public int delMaterial(Integer id);
 public int delMaterials(List<Integer> list);
 //¸Ä
 public int updateMaterial(Material material);
 public int updateMaterials(List<Material> List);
 //²é
 public Material findMaterialById(Integer id);
 public List<Material> findMaterialByPage(QueryMaterial queryMaterial);
 public int countMaterialByPage(QueryMaterial queryMaterial);

 public Material findMaterialByContract_addr (String contract_addr);
}
