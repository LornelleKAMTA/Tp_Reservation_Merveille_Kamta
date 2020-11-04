package org.reservation.restServer.controller;

import java.util.List;

import org.reservation.common.Material;
import org.reservation.controller.MaterialDao;
import org.reservation.controller.MaterialDaoImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class MaterialController {
	private MaterialDao materialDao = new MaterialDaoImpl();
		
	@RequestMapping(value="/Material", method=RequestMethod.GET)
	public List<Material>getAllMaterial() {
		return materialDao.findAll();
	}
	
	
	@GetMapping(value="/Material/{id}")
	public Material getMaterial(@PathVariable int id) {
		return materialDao.findById(id);
	}

}
