/**
 * 
 */
package dev.sgwebapi.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import dev.sgpwebapi.entite.Collaborateur;
import dev.sgpwebapi.entite.Departement;
import dev.sgpwebapi.repository.CollaborateurRepository;
import dev.sgpwebapi.repository.DepartementRepository;

@Component
class EventListenersDemarage {
	

	@Autowired CollaborateurRepository collaborateurRepository;
	
	@Autowired DepartementRepository departementRepository;

    @EventListener({ContextRefreshedEvent.class})
    void contextRefreshedEvent() {
    	
    	
    }
}  
