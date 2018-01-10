package dao.table;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ADO.QueryMaterial;
import entity.table.Material;
@Repository
public interface MaterialDAO {
 //增
 public int addMaterial(Material material);
 public int addMaterials(List<Material> list);
 //删
 public int delMaterial(Integer id);
 public int delMaterials(List<Integer> list);
 //改
 public int updateMaterial(Material material);
 public int updateMaterials(List<Material> List);
 //查
 public Material findMaterialById(Integer id);
 public List<Material> findMaterialByPage(QueryMaterial queryMaterial);
 public int countMaterialByPage(QueryMaterial queryMaterial);

 public Material findMaterialByContract_addr (String contract_addr);
}