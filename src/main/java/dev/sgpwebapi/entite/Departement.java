/**
 * 
 */
package dev.sgpwebapi.entite;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.web.bind.annotation.RestController;

@Entity
public class Departement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	public Departement(){
		
	}
	
	public Departement(String name){
		this.name=name;
		
	}

	/** getters
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** getters
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/** Setter
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
