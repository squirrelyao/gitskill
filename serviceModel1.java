package service.pakge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.table.EntityDAO;
import entity.ADO.QueryEntity;
import entity.table.Entity;

@Service
public class EntityService {
	@Resource(name="entity_nameDAO")
	private EntityDAO entity_nameDAO;
	
	public int addEntity(Entity entity_name) {
		return entity_nameDAO.addEntity(entity_name);
	}
	public int addEntitys(List<Entity> list) {
		return entity_nameDAO.addEntitys(list);
	}
	
	public int delEntity(Integer id) {
		return entity_nameDAO.delEntity(id);
	}
	public int delEntitys(List<Integer> list) {
		return entity_nameDAO.delEntitys(list);
	}
	
	public int updateEntity(Entity entity_name) {
		return entity_nameDAO.updateEntity(entity_name);
	}
	public int updateEntitys(List<Entity> list) {
		return entity_nameDAO.updateEntitys(list);
	}
	
	public Entity findEntityById(Integer id) {
		return entity_nameDAO.findEntityById(id);
	}
	public Map<String,Object> findEntityByPage(QueryEntity queryEntity){
		List<Entity> list=entity_nameDAO.findEntityByPage(queryEntity);
		int pages =entity_nameDAO.countEntityByPage(queryEntity);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("list", list);
		map.put("pages", pages);
		return map;
	}
	
	
}