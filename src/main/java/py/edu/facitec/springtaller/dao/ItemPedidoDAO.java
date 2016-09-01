package py.edu.facitec.springtaller.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.springtaller.model.ItemPedido;

@Repository
public class ItemPedidoDAO {

	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(ItemPedido itemPedido) {
		manager.persist(itemPedido);
}}
