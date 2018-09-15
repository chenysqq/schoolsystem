package com.lulu.schoolsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lulu.schoolsystem.service.StudentService;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月11日 下午6:40:34 
  * @version：   1.0.0
  * @describe:    
  */
@Controller
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@RequestMapping("delStuById/{uuid}")
	@ResponseBody
	public int delStuById(@PathVariable("uuid")String uuid){
		return ss.delStudentByUuid(uuid);
	}
}
