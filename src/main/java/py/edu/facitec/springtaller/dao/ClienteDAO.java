package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.Cliente;

//nos senhala que va a gestionar nuestra entidad
@Repository 
//clase que se encarga de la manipulacion de los datos, posibilita posteriormente utilizar la anotacion 
//Auwired
public class ClienteDAO { 

	
	
	@PersistenceContext  	
	private EntityManager manager; 
	 
	public void save(Cliente cliente){ 
		//metodo persist para inserta un dato
	 	manager.persist(cliente); 
	} 
} 

