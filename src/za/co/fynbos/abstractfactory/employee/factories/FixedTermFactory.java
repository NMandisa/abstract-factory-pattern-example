package za.co.fynbos.abstractfactory.employee.factories;

import za.co.fynbos.abstractfactory.EmployeeAbstractFactory;
import za.co.fynbos.abstractfactory.employee.types.FixedTerm;
import za.co.fynbos.entity.Employee;

public class FixedTermFactory implements EmployeeAbstractFactory{
	
	private String name;
	private String surname;
	private String designation;
	
	public FixedTermFactory(String name, String surname, String designation)// constructor taking 3 arg
	{
		this.name = name;
		this.surname = surname;
		this.designation = designation;
	}

	@Override
	public Employee onBoard() {
		return new FixedTerm(name,surname,designation);
	}

}
