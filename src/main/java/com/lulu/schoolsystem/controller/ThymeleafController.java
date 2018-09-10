package com.lulu.schoolsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** @author:  v_chenyongshuai@:
  * @date:  2018年7月19日 下午7:42:53 
  * @version：   1.0.0
  * @describe:    
  */

@Controller
public class ThymeleafController {
	
	@RequestMapping("index")
	public String indexHtml(){
		return "index";
	}
	
}
