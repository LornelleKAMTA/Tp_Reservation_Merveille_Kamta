package org.reservation.controller;

import java.util.ArrayList;
import java.util.List;

import org.reservation.common.Material;



public class MaterialDaoImpl implements MaterialDao {
	
	
	public static List<Material> materials =new ArrayList<Material>();
	
    static {
    	materials.add(new Material(1, new String("INFO 1"), new String("EPISEN"), new String("Créteil")));
    	materials.add(new Material(2, new String("INFO 2"), new String("ESIPE"), new String("Créteil")));
    	materials.add(new Material(3, new String("Stabilo"), new String("UPEC"), new String("Val De Marne")));
    	materials.add(new Material(4, new String("Gamixlab"), new String("EPISEN"), new String("Créteil")));
    	materials.add(new Material(5, new String("TD 6"), new String("ESIPE"), new String("Marne")));
    	materials.add(new Material(6, new String("Vidéo projecteur"), new String("Hp"), new String("1223DKI564")));

    }
	

	public List<Material> findAll() {
		return materials;
	}

	public Material findById(int id) {
		
		for(Material material :materials) {
			if(material.getId()==id)
		return material;
		}
		return null;
	}

	public Material save(Material material) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
