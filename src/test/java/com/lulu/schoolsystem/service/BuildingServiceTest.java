package com.lulu.schoolsystem.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lulu.schoolsystem.SpringBootApplication;
import com.lulu.schoolsystem.vo.OptionVO;


/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午1:07:58 
  * @version：   1.0.0
  * @describe:    
  */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SpringBootApplication.class)
public class BuildingServiceTest {
	
	@Autowired
	private BuildingService bs;
	
	@Test
	public void test(){
		List<OptionVO> all = bs.getAll();
	}
}
