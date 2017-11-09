/**
 * 
 */
package dev.sgpwebapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.sgpwebapi.entite.Collaborateur;


public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {

	public List<Collaborateur> findByDepartementId(int idDepartement);
	
	public Collaborateur findByMatricule(String matricule);

}
