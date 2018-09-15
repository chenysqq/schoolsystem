package com.lulu.schoolsystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lulu.schoolsystem.entity.Nation;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午11:00:59 
  * @version：   1.0.0
  * @describe:    
  */
public interface NationDao {
	
	@Select("select uuid,cn_desc from nation where status='1' and uuid=#{uuid}")
	Nation getNationByUuid(@Param("uuid")String uuid);
	
	
	@Select("select uuid,cn_desc from nation where status='1'")
	List<Nation> getAll();
}
