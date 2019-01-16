package com.cwq.o2o.web.superadmin;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cwq.o2o.entities.Area;
import com.cwq.o2o.service.AreaService;

/** 
 * @author Carpoor  
 * @date 2019年1月16日 
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {

	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value="/listarea", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> listArea(){
		HashMap<String, Object> model = new HashMap<>();
		List<Area> list = new ArrayList<>();
		try {
			list = areaService.getAreaList();
			model.put("rows", list);
			model.put("total", list.size());
		} catch (Exception e) {
			e.printStackTrace();
			model.put("success", false);
			model.put("errMsg", e.toString());
		}
		
		return model;
	}
	
}
