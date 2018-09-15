package com.lulu.schoolsystem.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lulu.schoolsystem.dao.BuildingDao;
import com.lulu.schoolsystem.dao.ClazzDao;
import com.lulu.schoolsystem.dao.CollegeDao;
import com.lulu.schoolsystem.dao.RoomDao;
import com.lulu.schoolsystem.dao.StudentDao;
import com.lulu.schoolsystem.entity.Building;
import com.lulu.schoolsystem.entity.Clazz;
import com.lulu.schoolsystem.entity.College;
import com.lulu.schoolsystem.entity.Room;
import com.lulu.schoolsystem.entity.Student;
import com.lulu.schoolsystem.service.StudentService;
import com.lulu.schoolsystem.vo.ClazzVO;
import com.lulu.schoolsystem.vo.DormitoryVO;
import com.lulu.schoolsystem.vo.StudentVO;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月11日 下午6:39:35 
  * @version：   1.0.0
  * @describe:    
  */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sd;
	@Autowired
	private ClazzDao cd;
	@Autowired
	private CollegeDao cod;
	@Autowired
	private RoomDao rd;
	@Autowired
	private BuildingDao bd;
	
	@Override
	public List<StudentVO> getAll() {
		List<Student> students = sd.getAll();
		List<StudentVO> studentsVO = new ArrayList<StudentVO>();
		for (Student student : students) {
			StudentVO studentVo = new StudentVO();
			try {
				//
				Clazz clazz = cd.getClassByStudent(student.getClassNo());
				ClazzVO clazzVO = new ClazzVO();
				BeanUtils.copyProperties(clazzVO, clazz);
				College college = cod.getCollegeByUuid(clazz.getCollegeNo());
				clazzVO.setCollege(college);
				studentVo.setClazzVO(clazzVO);
				//
				Room room = rd.getRoomByDormitoryNo(student.getDormitoryNo());
				DormitoryVO dormitoryVO = new DormitoryVO();
				BeanUtils.copyProperties(dormitoryVO, room);
				Building building = bd.getBuildingByUuid(room.getBuildNo());
				dormitoryVO.setBuilding(building);
				studentVo.setDormitoryVO(dormitoryVO);
				//
				BeanUtils.copyProperties(studentVo, student);
				studentsVO.add(studentVo);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return studentsVO;
	}

	@Override
	public int delStudentByUuid(String uuid) {
		return 0;
	}

	
}
