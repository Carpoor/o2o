package com.cwq.o2o.dao;

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
public class AreaDaoTest extends BaseTest {

	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQuery() {
		List<Area> queryArea = areaDao.queryArea();
		assertEquals(queryArea.size(), 2);
	}
	
}
