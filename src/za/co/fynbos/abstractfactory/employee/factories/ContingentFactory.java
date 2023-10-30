package za.co.fynbos.abstractfactory.employee.factories;

import za.co.fynbos.abstractfactory.EmployeeAbstractFactory;
import za.co.fynbos.abstractfactory.employee.types.Contingent;
import za.co.fynbos.entity.Employee;

public class ContingentFactory implements EmployeeAbstractFactory{
	
	private String name;
	private String surname;
	private String designation;
	
	public ContingentFactory(String name, String surname, String designation)// constructor taking 4 arg
	{
		this.name = name;
		this.surname = surname;
		this.designation = designation;
	}

	@Override
	public Employee onBoard() {
		return new Contingent(name,surname,designation);
	}

}
