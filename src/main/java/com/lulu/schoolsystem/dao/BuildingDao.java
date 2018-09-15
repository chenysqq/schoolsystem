package com.lulu.schoolsystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.lulu.schoolsystem.entity.Building;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月13日 下午4:43:56 
  * @version：   1.0.0
  * @describe:    
  */
public interface BuildingDao {

	@Select("select uuid,building_cn_name from building")
	List<Building> getAll();
	
	@Select("select uuid,building_cn_name from building where status = '1' and uuid=#{uuid}")
	Building getBuildingByUuid(String uuid);
}
