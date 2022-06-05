package ar.edu.unlam.pb2;

public class Manager extends Trabajador {

	private String ubicacionCochera;
	
	public Manager(Integer dni, String nombre, String apellido, Integer salario, String fechaNacimiento) {
		super(dni, nombre, apellido, salario, fechaNacimiento);
	}

	public String getUbicacionCochera() {
		return ubicacionCochera;
	}

	public void setUbicacionCochera(String ubicacionCochera) {
		this.ubicacionCochera = ubicacionCochera;
	}
	
}
