package com.lulu.schoolsystem.entity;
/** @author:  v_chenyongshuai@:
  * @date:  2018年9月13日 下午4:28:47 
  * @version：   1.0.0
  * @describe:    
  */
public class Room {
	
	private String uuid;
	private String roomNo;
	private String buildNo;
	private String createTime;
	private String updateTime;
	public Room() {
		super();
	}
	public Room(String uuid, String roomNo, String buildNo, String createTime, String updateTime) {
		super();
		this.uuid = uuid;
		this.roomNo = roomNo;
		this.buildNo = buildNo;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Room [uuid=" + uuid + ", roomNo=" + roomNo + ", buildNo=" + buildNo + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
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
	public String getBuildNo() {
		return buildNo;
	}
	public void setBuildNo(String buildNo) {
		this.buildNo = buildNo;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
}
