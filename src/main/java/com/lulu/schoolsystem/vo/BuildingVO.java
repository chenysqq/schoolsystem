package com.lulu.schoolsystem.vo;

import java.util.List;

import com.lulu.schoolsystem.entity.Room;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月13日 下午4:41:00 
  * @version：   1.0.0
  * @describe:    
  */
public class BuildingVO {
	
	private String uuid;
	private String buildingCnName;
	private String buildingEngName;
	private List<Room> rooms;
	public BuildingVO() {
		super();
		
	}
	public BuildingVO(String uuid, String buildingCnName, String buildingEngName, List<Room> rooms) {
		super();
		this.uuid = uuid;
		this.buildingCnName = buildingCnName;
		this.buildingEngName = buildingEngName;
		this.rooms = rooms;
	}
	@Override
	public String toString() {
		return "BuildingVO [uuid=" + uuid + ", buildingCnName=" + buildingCnName + ", buildingEngName="
				+ buildingEngName + ", rooms=" + rooms + "]";
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getBuildingCnName() {
		return buildingCnName;
	}
	public void setBuildingCnName(String buildingCnName) {
		this.buildingCnName = buildingCnName;
	}
	public String getBuildingEngName() {
		return buildingEngName;
	}
	public void setBuildingEngName(String buildingEngName) {
		this.buildingEngName = buildingEngName;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	
	
}
