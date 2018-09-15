package com.lulu.schoolsystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lulu.schoolsystem.entity.Clazz;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午8:11:57 
  * @version：   1.0.0
  * @describe:    
  */
public interface ClazzDao {
	
	
	@Select("select uuid,cla_name from class where status='1' and college_no=#{uuid}")
	List<Clazz> getClassByCollege(@Param("uuid")String uuid);
	
	@Select("select uuid,cla_name,college_no from class where status='1' and uuid=#{classNo}")
	Clazz getClassByStudent(String classNo);
}
