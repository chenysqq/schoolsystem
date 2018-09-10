package com.lulu.schoolsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lulu.schoolsystem.entity.Resource;
import com.lulu.schoolsystem.service.ResourceService;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月9日 下午10:03:23 
  * @version：   1.0.0
  * @describe:    
  */
@Controller
@RequestMapping("/res")
public class ResourceController {
	
	@Autowired
	private ResourceService rs;
	
	@RequestMapping("/getMenu")
	@ResponseBody
	public List<Resource> getMenu(){
		return rs.getMenu();
	}
}
