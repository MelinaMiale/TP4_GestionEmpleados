package ar.edu.unlam.pb2;
import java.util.Set;

public class Empresa {
	
	private String nombre;
	private Set<Departamento> departamentos;
	private Set<Trabajador> trabajadores;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Set<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public Set<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(Set<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}
	
}
