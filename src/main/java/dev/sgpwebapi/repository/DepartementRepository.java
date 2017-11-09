/**
 * 
 */
package dev.sgpwebapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.sgpwebapi.entite.Collaborateur;
import dev.sgpwebapi.entite.Departement;


public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
