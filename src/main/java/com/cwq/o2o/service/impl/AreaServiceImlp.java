package com.cwq.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwq.o2o.dao.AreaDao;
import com.cwq.o2o.entities.Area;
import com.cwq.o2o.service.AreaService;

/** 
 * @author Carpoor  
 * @date 2019年1月16日 
 */
@Service
public class AreaServiceImlp implements AreaService {

	@Autowired
	private AreaDao areaDao;
	
	@Override
	public List<Area> getAreaList() {
		// TODO Auto-generated method stub
		return areaDao.queryArea();
	}

}
