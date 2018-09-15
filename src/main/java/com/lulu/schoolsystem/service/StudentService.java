package com.lulu.schoolsystem.service;

import java.util.List;

import com.lulu.schoolsystem.vo.StudentVO;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月11日 下午6:39:10 
  * @version：   1.0.0
  * @describe:    
  */
public interface StudentService {
	
	List<StudentVO> getAll();
	
	int delStudentByUuid(String uuid);
}
