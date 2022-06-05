package ar.edu.unlam.pb2;

import java.util.Objects;

public class Trabajador implements Comparable<Trabajador> {
	
	private String nombre;
	private String apellido;
	private Integer salario;
	private String fechaNacimiento;
	private Integer dni;
	
	public Trabajador(Integer dni, String nombre, String apellido, Integer salario, String fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public int compareTo(Trabajador trabajador) {
		if(this.getApellido().compareTo(trabajador.getApellido()) < 0) {
			return -1;
		} else if (this.getApellido().compareTo(trabajador.getApellido()) > 0) {
			return 1;
		}
		return 0;
	}

	
}
