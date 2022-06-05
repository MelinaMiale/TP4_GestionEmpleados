package ar.edu.unlam.pb2;

public class Director extends Manager {

	private Integer sueldoExtra;
	
	public Director(Integer dni, String nombre, String apellido, Integer salario, String fechaNacimiento) {
		super(dni, nombre, apellido, salario, fechaNacimiento);
	}

	public Integer getSueldoExtra() {
		return sueldoExtra;
	}

	public void setSueldoExtra(Integer sueldoExtra) {
		this.sueldoExtra = sueldoExtra;
	}

}
