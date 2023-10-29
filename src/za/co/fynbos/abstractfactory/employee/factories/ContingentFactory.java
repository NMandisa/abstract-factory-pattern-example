package za.co.fynbos.abstractfactory.employee.factories;

import za.co.fynbos.abstractfactory.EmployeeAbstractFactory;
import za.co.fynbos.abstractfactory.employee.Employee;
import za.co.fynbos.abstractfactory.employee.types.Contingent;
import za.co.fynbos.abstractfactory.employee.types.Intern;

public class ContingentFactory implements EmployeeAbstractFactory{
	
	private String name;
	private String surname;
	private Long taxNumber;
	private String designation;
	
	public ContingentFactory(String name, String surname, Long taxNumber, String designation)// constructor taking 4 arg
	{
		this.name = name;
		this.surname = surname;
		this.taxNumber = taxNumber;
		this.designation = designation;
	}

	@Override
	public Employee onBoard() {
		return new Contingent(name,surname,taxNumber,designation);
	}

}
