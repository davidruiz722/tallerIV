package py.edu.facitec.springtaller.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.springtaller.dao.ClienteDAO;
import py.edu.facitec.springtaller.model.Cliente;

@Transactional

@Controller
public class ClienteController {
	@Autowired
	private ClienteDAO clienteDAO;
	
	@RequestMapping("/cliente")
					//viene los datos del formulario y se pasa al objeto
	public String save(Cliente cliente){
		System.out.println("Registrando el cliente"+cliente);
		clienteDAO.save(cliente);
		
		
						//CREAR LA pagina ok.jsp
		return "/cliente/ok";
	}
	   @RequestMapping("/cliente/formulario") 
	   //metodo correspondinte para acceder al formulario
	 public String formulario(){ 
	 	 	 
		  System.out.println("holaaa"); 
		   					
	 	 	return "/cliente/formulario"; 
	 } 


}
