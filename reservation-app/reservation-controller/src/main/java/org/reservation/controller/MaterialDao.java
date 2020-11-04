package org.reservation.controller;

import java.util.List;

import org.reservation.common.Material;



public interface MaterialDao{
	    public List<Material> findAll();
	    public Material findById(int id);
	    public Material save(Material material);
	

}
