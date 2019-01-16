package com.cwq.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cwq.o2o.BaseTest;
import com.cwq.o2o.entities.Area;

/** 
 * @author Carpoor  
 * @date 2019年1月16日 
 */
public class AreaServiceTest extends BaseTest {

	@Autowired
	private AreaService areaService;
	
	@Test
	public void testQuery() {
		List<Area> areaList = areaService.getAreaList();
		assertEquals("西苑", areaList.get(0).getAreaName());
	}
	
}
