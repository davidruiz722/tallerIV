package py.edu.facitec.springtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import py.edu.facitec.springtaller.model.general.General;


@Entity
public class Departamento extends General{
	

	private String descripcion;
	
	//indicamos que la relacion es de uno a uno
	@OneToOne
	private Gerente gerente;
	
	@OneToMany(mappedBy="departamento")
	private List<Usuario> listaUsuario;


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	
	

}
