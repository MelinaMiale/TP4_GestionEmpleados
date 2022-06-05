package ar.edu.unlam.pb2;

import java.util.Objects;
import java.util.TreeSet;

public class Departamento {

	private Integer id;
	private Manager manager;
	private TreeSet<Empleado> empleados;
	
	public Departamento(Manager manager) {
		this.manager = manager;
		this.empleados = new TreeSet<Empleado>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public TreeSet<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(TreeSet<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(id, other.id);
	}
	
}
