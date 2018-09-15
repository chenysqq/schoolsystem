package com.lulu.schoolsystem.vo;

import com.lulu.schoolsystem.entity.Building;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月15日 下午3:56:11 
  * @version：   1.0.0
  * @describe:    
  */
public class DormitoryVO {

	private String uuid;
	private String roomNo;
	private Building building;
	public DormitoryVO() {
		super();
		
	}
	public DormitoryVO(String uuid, String roomNo, Building building) {
		super();
		this.uuid = uuid;
		this.roomNo = roomNo;
		this.building = building;
	}
	@Override
	public String toString() {
		return "DormitoryVO [uuid=" + uuid + ", roomNo=" + roomNo + ", building=" + building + "]";
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
}
