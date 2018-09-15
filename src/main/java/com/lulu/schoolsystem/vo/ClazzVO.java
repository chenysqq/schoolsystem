package com.lulu.schoolsystem.vo;

import com.lulu.schoolsystem.entity.College;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月15日 下午3:54:14 
  * @version：   1.0.0
  * @describe:    
  */
public class ClazzVO {
	
	private String uuid;
	private String claName;
	private College college;
	public ClazzVO() {
		super();
		
	}
	public ClazzVO(String uuid, String claName, College college) {
		super();
		this.uuid = uuid;
		this.claName = claName;
		this.college = college;
	}
	@Override
	public String toString() {
		return "ClazzVO [uuid=" + uuid + ", claName=" + claName + ", college=" + college + "]";
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getClaName() {
		return claName;
	}
	public void setClaName(String claName) {
		this.claName = claName;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
}
