package com.lulu.schoolsystem.service;

import java.util.List;

import com.lulu.schoolsystem.entity.Nation;
import com.lulu.schoolsystem.vo.OptionVO;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月15日 上午9:27:44 
  * @version：   1.0.0
  * @describe:    
  */
public interface NationService {
	
	Nation getNationByUuid(String uuid);
	
	List<OptionVO> getAll();
}
