/**
 * 
 */
package dev.sgpwebapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sgpwebapi.entite.Banque;

public interface BanqueRepository extends JpaRepository<Banque, Integer> {

}