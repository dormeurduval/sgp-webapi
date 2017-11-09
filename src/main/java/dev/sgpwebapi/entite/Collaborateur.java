/**
 * 
 */
package dev.sgpwebapi.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Collaborateur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	
	@ManyToOne()
	Departement departement;
	
	@OneToOne()
	Banque banque;
	
	@Column
	String matricule;
	
	
	public Collaborateur(){
		
	}
	
	public Collaborateur(String name,Departement departement,String matricule,Banque banque){
		this.name=name;
		this.departement=departement;
		this.matricule=matricule;
		this.banque=banque;
	}
	
	

	/** getters
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/** Setter
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/** getters
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/** Setter
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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

	/** getters
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}

	/** Setter
	 * @param departement the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
}
