package com.lulu.schoolsystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.lulu.schoolsystem.entity.College;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午8:12:09 
  * @version：   1.0.0
  * @describe:    
  */
public interface CollegeDao {
	
	@Select("select uuid,college_cn_name from college where status='1'")
	List<College> getAll();
	
	@Select("select uuid,college_cn_name from college where status='1' and uuid=#{collegeNo}")
	College getCollegeByUuid(String collegeNo);
}
