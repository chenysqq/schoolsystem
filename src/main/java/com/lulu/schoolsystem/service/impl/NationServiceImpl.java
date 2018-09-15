package com.lulu.schoolsystem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lulu.schoolsystem.dao.NationDao;
import com.lulu.schoolsystem.entity.Nation;
import com.lulu.schoolsystem.service.NationService;
import com.lulu.schoolsystem.vo.OptionVO;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月15日 上午9:29:48 
  * @version：   1.0.0
  * @describe:    
  */
@Service
public class NationServiceImpl implements NationService {

	@Autowired
	private NationDao ns;
	
	@Override
	public Nation getNationByUuid(String uuid) {
		return null;
	}

	@Override
	public List<OptionVO> getAll() {
		List<Nation> nations = ns.getAll();
		List<OptionVO> nationsVO = new ArrayList<OptionVO>();
		for (Nation nation : nations) {
			OptionVO optionVO = new OptionVO();
			optionVO.setValue(nation.getUuid());
			optionVO.setLabel(nation.getCnDesc());
			nationsVO.add(optionVO);
		}
		return nationsVO;
	}

}
