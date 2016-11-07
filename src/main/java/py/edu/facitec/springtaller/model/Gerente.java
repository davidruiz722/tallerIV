package py.edu.facitec.springtaller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente {
	
	@Id
	private Integer id;

	private String ci;
	private String nombre;
	
	@OneToOne(mappedBy="gerente")
	private Departamento departamento;
	
	
	
	
	public Gerente() {
	
		ci="";
		nombre="";
		}




	






	public String getCi() {
		return ci;
	}




	public void setCi(String ci) {
		this.ci = ci;
	}




	public String getNombre() {
		return nombre;
	}
	
	




	public Integer getId() {
		return id;
	}











	public void setId(Integer id) {
		this.id = id;
	}











	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public Departamento getDepartamento() {
		return departamento;
	}




	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	
	
	
}
