package com.lulu.schoolsystem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lulu.schoolsystem.dao.BuildingDao;
import com.lulu.schoolsystem.dao.RoomDao;
import com.lulu.schoolsystem.entity.Building;
import com.lulu.schoolsystem.entity.Room;
import com.lulu.schoolsystem.service.BuildingService;
import com.lulu.schoolsystem.vo.OptionVO;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 上午10:56:04 
  * @version：   1.0.0
  * @describe:    
  */
@Service
public class BuildingServiceImpl implements BuildingService {
	
	@Autowired
	private BuildingDao bd;
	@Autowired
	private RoomDao rd;
	
	@Override
	public List<OptionVO> getAll() {
		List<Building> buildings = bd.getAll();
		List<OptionVO> optionsVO = new ArrayList<OptionVO>();
		for (Building building : buildings) {
			OptionVO optionVO = new OptionVO();
			optionVO.setValue(building.getUuid());
			optionVO.setLabel(building.getBuildingCnName());
			optionsVO.add(optionVO);
		}
		for (OptionVO optionVO : optionsVO) {
			List<Room> rooms = rd.getRoomsByBuildNo(optionVO.getValue());
			List<OptionVO> optionsRoomVO = new ArrayList<OptionVO>();
			for (Room room : rooms) {
				OptionVO optionRoomVO = new OptionVO();
				optionRoomVO.setValue(room.getUuid());
				optionRoomVO.setLabel(room.getRoomNo());
				optionsRoomVO.add(optionRoomVO);
			}
			optionVO.setChildren(optionsRoomVO);
		}
		return optionsVO;
	}

}
