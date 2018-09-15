package com.lulu.schoolsystem.module.init;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lulu.schoolsystem.dto.StudentModuleDTO;
import com.lulu.schoolsystem.service.BuildingService;
import com.lulu.schoolsystem.service.CollegeService;
import com.lulu.schoolsystem.service.NationService;
import com.lulu.schoolsystem.service.PoliticalService;
import com.lulu.schoolsystem.service.StudentService;
import com.lulu.schoolsystem.vo.OptionVO;
import com.lulu.schoolsystem.vo.StudentVO;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 上午11:06:04 
  * @version：   1.0.0
  * @describe:    
  */
@Controller
@RequestMapping("studentModule")
public class StudentModule {
	
	@Autowired
	private BuildingService bs;
	@Autowired
	private StudentService ss;
	@Autowired
	private CollegeService cs;
	@Autowired
	private NationService ns;
	@Autowired
	private PoliticalService ps;
	
	@RequestMapping("init")
	@ResponseBody
	public StudentModuleDTO init(){
		StudentModuleDTO smDTO = new StudentModuleDTO();
		List<OptionVO> dormitorys = bs.getAll();
		List<StudentVO> students = ss.getAll();
		List<OptionVO> colleges = cs.getAll();
		List<OptionVO> nations = ns.getAll();
		List<OptionVO> politicals = ps.getAll();
		smDTO.setDormitorys(dormitorys);
		smDTO.setStudents(students);
		smDTO.setColleges(colleges);
		smDTO.setNations(nations);
		smDTO.setPoliticals(politicals);
		return smDTO;
	}
}
