package com.lulu.schoolsystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lulu.schoolsystem.entity.Room;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 上午10:53:05 
  * @version：   1.0.0
  * @describe:    
  */
public interface RoomDao {
	
	
	@Select("select uuid,room_no from room where build_no=#{buildNo}")
	List<Room> getRoomsByBuildNo(@Param("buildNo")String buildNo);
	
	@Select("select uuid,room_no,build_no from room where uuid=#{dormitoryNo}")
	Room getRoomByDormitoryNo(@Param("dormitoryNo")String dormitoryNo);
	
}	
