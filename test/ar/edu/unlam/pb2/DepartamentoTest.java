package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class DepartamentoTest {

	@Test
	//que se pueda crear un departamento
	public void queSePuedaCrearUnDepartamento() {
		//given
		Manager supervisor1 = new Manager(321000, "Pedro", "Escamoso", 25000, "20/01/1980");
		Departamento dContable;
		
		//when
		dContable = new Departamento(supervisor1);
		
		//then
		assertFalse(dContable.equals(null));
		assertNotNull(dContable);
		
	}
	
		
	//que no se pueda crear un departamento sin gerente a cargo del mismo

	@Test
	//que al solicitar el listado de empleados venga ordenado alfabéticamente
	public void queAlSolicitarElListadoDeEmpleadosVengaOrdenadoAlfabéticamente() {
		Manager supervisor1 = new Manager(321000, "Pedro", "Escamoso", 25000, "20/01/1980");
		Departamento dContable;
	
		Empleado empleado1 = new Empleado(2150234, "Rosalinda", "Del Castillo de Altamirano", 10000, "10/10/2001"); 
		Empleado empleado2 = new Empleado(3150235, "Marimar", "Marimar", 20000, "09/09/1999");
		Empleado empleado3 = new Empleado(4150236, "Maria", "Hernández de De la Vega", 30000, "08/08/1988"); 
		
		
		//when
		dContable = new Departamento(supervisor1);
		dContable.getEmpleados().addAll(List.of(empleado1, empleado2, empleado3));
		
		//then
		assertEquals(empleado1, dContable.getEmpleados().first());
		assertEquals(empleado2, dContable.getEmpleados().last());
	}

}
