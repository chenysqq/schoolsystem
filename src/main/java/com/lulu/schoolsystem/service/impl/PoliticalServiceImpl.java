package com.lulu.schoolsystem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lulu.schoolsystem.dao.PoliticalDao;
import com.lulu.schoolsystem.entity.Political;
import com.lulu.schoolsystem.service.PoliticalService;
import com.lulu.schoolsystem.vo.OptionVO;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月15日 下午10:48:28 
  * @version：   1.0.0
  * @describe:    
  */
@Service
public class PoliticalServiceImpl implements PoliticalService {

	@Autowired
	private PoliticalDao pd;
	
	@Override
	public List<OptionVO> getAll() {
		List<Political> politicals = pd.getAll();
		List<OptionVO> politicalsVO = new ArrayList<OptionVO>();
		for (Political political : politicals) {
			OptionVO optionVO = new OptionVO();
			optionVO.setValue(political.getUuid());
			optionVO.setLabel(political.getCnDesc());
			politicalsVO.add(optionVO);
		}
		return politicalsVO;
	}

}
