package com.lulu.schoolsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lulu.schoolsystem.dao.ResourceDao;
import com.lulu.schoolsystem.entity.Resource;
import com.lulu.schoolsystem.service.ResourceService;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月9日 下午10:02:11 
  * @version：   1.0.0
  * @describe:    
  */
@Service
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	private ResourceDao rd;
	
	@Override
	public List<Resource> getMenu() {
		List<Resource> menu = rd.getMenu(null);
		for (Resource resource : menu) {
			getResourceById(resource);
		}
		return menu;
	}
	//查询所有的资源
	public List<Resource> getResourceById(Resource resource){
		
		List<Resource> allResource = rd.getMenu(resource.getUuid());
		
		if( allResource !=null && allResource.size()>0){
			
			resource.setSons(allResource);
			
			for (Resource son : allResource) {
				
				getResourceById(son);
			}
		}
		return allResource;
	}
}
