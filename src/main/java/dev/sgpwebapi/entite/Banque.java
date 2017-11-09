/**
 * 
 */
package dev.sgpwebapi.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banque {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String bic;
	
	@Column
	String rib;

	public Banque(){
		
	}
	
	public Banque(String bic,String rib){
		this.bic=bic;
		this.rib=rib;
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
	 * @return the bic
	 */
	public String getBic() {
		return bic;
	}

	/** Setter
	 * @param bic the bic to set
	 */
	public void setBic(String bic) {
		this.bic = bic;
	}

	/** getters
	 * @return the rib
	 */
	public String getRib() {
		return rib;
	}

	/** Setter
	 * @param rib the rib to set
	 */
	public void setRib(String rib) {
		this.rib = rib;
	}
	
	
	
}
