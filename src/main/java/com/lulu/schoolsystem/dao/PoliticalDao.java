package com.lulu.schoolsystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.lulu.schoolsystem.entity.Political;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月15日 下午5:10:37 
  * @version：   1.0.0
  * @describe:    
  */
public interface PoliticalDao {
	
	@Select("select uuid,cn_desc from political where status='1'")
	List<Political> getAll();
	
	
}
