package com.lulu.schoolsystem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lulu.schoolsystem.dao.ClazzDao;
import com.lulu.schoolsystem.dao.CollegeDao;
import com.lulu.schoolsystem.entity.Clazz;
import com.lulu.schoolsystem.entity.College;
import com.lulu.schoolsystem.service.CollegeService;
import com.lulu.schoolsystem.vo.OptionVO;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午8:21:27 
  * @version：   1.0.0
  * @describe:    
  */
@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeDao cod;
	@Autowired
	private ClazzDao cd;
	
	@Override
	public List<OptionVO> getAll() {
		List<College> colleges = cod.getAll();
		List<OptionVO> optionsVO = new ArrayList<OptionVO>();
		for (College college : colleges) {
			OptionVO optionVO = new OptionVO();
			optionVO.setValue(college.getUuid());
			optionVO.setLabel(college.getCollegeCnName());
			optionsVO.add(optionVO);
		}
		for (OptionVO optionVO : optionsVO) {
			List<Clazz> classes = cd.getClassByCollege(optionVO.getValue());
			List<OptionVO> optionsClassesVO = new ArrayList<OptionVO>();
			for (Clazz clazz : classes) {
				OptionVO optionClazzVO = new OptionVO();
				optionClazzVO.setValue(clazz.getUuid());
				optionClazzVO.setLabel(clazz.getClaName());
				optionsClassesVO.add(optionClazzVO);
			}
			optionVO.setChildren(optionsClassesVO);
		}
		return optionsVO;
	}

}
