/**
 * 
 */
package dev.sgpwebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dev.sgpwebapi.entite.*;
import dev.sgpwebapi.repository.DepartementRepository;

@RestController
public class DepartementController {

	@Autowired DepartementRepository departementRepository;
	
	@RequestMapping(value="/api/departements",method=RequestMethod.GET,produces = "application/json")
	public @ResponseBody List<Departement> listDepartements(){
		return departementRepository.findAll();
		
	}
	
}
