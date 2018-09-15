package com.lulu.schoolsystem.dto;

import java.util.List;

import com.lulu.schoolsystem.entity.College;
import com.lulu.schoolsystem.vo.OptionVO;
import com.lulu.schoolsystem.vo.StudentVO;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 上午11:08:57 
  * @version：   1.0.0
  * @describe:    
  */
public class StudentModuleDTO {
	
	private List<OptionVO> dormitorys;
	
	private List<StudentVO> students;
	
	private List<OptionVO> colleges;
	
	private List<OptionVO> nations;
	
	private List<OptionVO> politicals;

	public StudentModuleDTO() {
		super();
		
	}

	public StudentModuleDTO(List<OptionVO> dormitorys, List<StudentVO> students, List<OptionVO> colleges,
			List<OptionVO> nations, List<OptionVO> politicals) {
		super();
		this.dormitorys = dormitorys;
		this.students = students;
		this.colleges = colleges;
		this.nations = nations;
		this.politicals = politicals;
	}

	@Override
	public String toString() {
		return "StudentModuleDTO [dormitorys=" + dormitorys + ", students=" + students + ", colleges=" + colleges
				+ ", nations=" + nations + ", politicals=" + politicals + "]";
	}

	public List<OptionVO> getDormitorys() {
		return dormitorys;
	}

	public void setDormitorys(List<OptionVO> dormitorys) {
		this.dormitorys = dormitorys;
	}

	public List<StudentVO> getStudents() {
		return students;
	}

	public void setStudents(List<StudentVO> students) {
		this.students = students;
	}

	public List<OptionVO> getColleges() {
		return colleges;
	}

	public void setColleges(List<OptionVO> colleges) {
		this.colleges = colleges;
	}

	public List<OptionVO> getNations() {
		return nations;
	}

	public void setNations(List<OptionVO> nations) {
		this.nations = nations;
	}

	public List<OptionVO> getPoliticals() {
		return politicals;
	}

	public void setPoliticals(List<OptionVO> politicals) {
		this.politicals = politicals;
	}

	
}
