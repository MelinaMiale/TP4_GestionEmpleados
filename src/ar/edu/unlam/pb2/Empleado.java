package ar.edu.unlam.pb2;

public class Empleado extends Trabajador {
	
	private Integer managerId;
	
	public Empleado(Integer dni, String nombre, String apellido, Integer salario, String fechaNacimiento) {
		super(dni, nombre, apellido, salario, fechaNacimiento);
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	
	
}
