/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jbr.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.PeticionDAO;
import jbr.springmvc.model.Peticion;
 

public class PeticionService {
	 @Autowired
	  public PeticionDAO peticion;
	 public void registerP(Peticion user) {
		    peticion.registerPeticion(user);
		  }

		  public List<Peticion> validateUser() {
		    return peticion.devuelvePeticiones();
		  }
	 
    
     
}	