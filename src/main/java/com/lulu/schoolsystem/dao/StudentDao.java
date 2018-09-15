package com.lulu.schoolsystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lulu.schoolsystem.entity.Student;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月10日 下午10:58:54 
  * @version：   1.0.0
  * @describe:    
  */
public interface StudentDao {
	
	@Select("select * from student order by uuid")
	List<Student> getAll();
	
	
	
}
