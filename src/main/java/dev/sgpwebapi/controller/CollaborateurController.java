/**
 * 
 */
package dev.sgpwebapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.sgpwebapi.entite.Banque;
import dev.sgpwebapi.entite.Collaborateur;
import dev.sgpwebapi.entite.Departement;
import dev.sgpwebapi.repository.BanqueRepository;
import dev.sgpwebapi.repository.CollaborateurRepository;
import dev.sgpwebapi.repository.DepartementRepository;

@RestController
public class CollaborateurController {

	@Autowired CollaborateurRepository collaborateurRepository;
	
	@Autowired DepartementRepository departementRepository;
	
	@Autowired BanqueRepository banqueRepository;
	
	@RequestMapping(value="/api/collaborateurs",method=RequestMethod.GET,produces = "application/json")
	public @ResponseBody List<Collaborateur> listDepartements(@RequestParam(value = "departement")Integer idDepartement){

		System.out.println("this is the id "+idDepartement);
		
		return collaborateurRepository.findByDepartementId(idDepartement);
		
	}
	
	@RequestMapping(value="/api/collaborateurs/{matricule}",method=RequestMethod.GET,produces = "application/json")
	public @ResponseBody Collaborateur matricule(@PathVariable(value ="matricule")String matricule){
		
		return collaborateurRepository.findByMatricule(matricule);
		
	}
	
	@RequestMapping(value="/api/collaborateurs/{matricule}",method=RequestMethod.PUT)
	public @ResponseBody void modification(@PathVariable(value ="matricule")String matricule,
	@RequestBody Collaborateur collaborateur){
		Collaborateur newCollaborateur= collaborateurRepository.findByMatricule(matricule);
		newCollaborateur.setDepartement(collaborateur.getDepartement());
		newCollaborateur.setMatricule(collaborateur.getMatricule());
		newCollaborateur.setName(collaborateur.getName());
		
		collaborateurRepository.save(newCollaborateur);
	}
	
	@RequestMapping(value="/api/collaborateurs/{matricule}/banque",method=RequestMethod.GET,produces = "application/json")
	public @ResponseBody Banque banque(@PathVariable(value ="matricule")String matricule){
		/*
		Departement departement = new Departement("Informatique");
		
		departementRepository.save(departement);
		
		Banque banque = new Banque("bic1","rib1");
		
		banqueRepository.save(banque);
		
		Collaborateur collaborateur = new Collaborateur("alfred",departement,"M00",banque);
		
		collaborateurRepository.save(collaborateur);
		
		departement = new Departement("Electronique");
		
		departementRepository.save(departement);
		
		banque = new Banque("bic2","rib2");
		
		banqueRepository.save(banque);
		
		collaborateur = new Collaborateur("george",departement,"M11",banque);
		
		collaborateurRepository.save(collaborateur);
		
		System.out.println(matricule);*/
		
		return collaborateurRepository.findByMatricule(matricule).getBanque();
		
	}
	
	@RequestMapping(value="/api/collaborateurs/{matricule}/banque",method=RequestMethod.PUT)
	public @ResponseBody void modificationBanque(@PathVariable(value ="matricule")String matricule,
	@RequestBody Banque banque){
		Collaborateur newCollaborateur= collaborateurRepository.findByMatricule(matricule);
		newCollaborateur.setBanque(banque);
		
		collaborateurRepository.save(newCollaborateur);
	}
	
}
