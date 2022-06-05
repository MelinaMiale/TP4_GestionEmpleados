package ar.edu.unlam.pb2;

public class Ingeniero extends Trabajador {

	private Integer bonoProductividad;
	
	public Ingeniero(Integer dni, String nombre, String apellido, Integer salario, String fechaNacimiento) {
		super(dni, nombre, apellido, salario, fechaNacimiento);
	}
	
	public Integer getSalario() {
		return super.getSalario() + this.getBonoProductividad() ;
	}

	public Integer getBonoProductividad() {
		return bonoProductividad;
	}

	public void setBonoProductividad(Integer bonoProductividad) {
		this.bonoProductividad = bonoProductividad;
	}

}
