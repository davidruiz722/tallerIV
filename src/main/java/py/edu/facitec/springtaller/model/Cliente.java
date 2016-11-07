package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import py.edu.facitec.springtaller.model.general.General;

//significa que creara una tabla cliente
@Entity
public class Cliente extends General{
	

	private String nombre;
	private String correo;

	//Aotacion aplicada para ignorar el atributo de json
	@JsonIgnore
	//anotacion que sirve para aclara que de uno para mucho
	@OneToMany(mappedBy="cliente")
	private List<Pedido> pedidos;



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public List<Pedido> getPedidos() {
		return pedidos;
	}


	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	
	
	}
