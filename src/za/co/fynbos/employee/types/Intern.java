package za.co.fynbos.employee.types;

import za.co.fynbos.employee.EmployeeAbstractFactory;
import za.co.fynbos.entity.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class Intern extends Employee implements EmployeeAbstractFactory {

	public Intern(){super();}  //default constructor
	public Intern(String name,String surname) //constructor taking 2 arg 
	{
		this.name=name;
		this.surname=surname;
	}

	public Intern(String name, String surname, String designation) {
		super();
		this.name=name;
		this.surname=surname;
		this.designation=designation;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getSurname() {
		return this.surname;
	}

	@Override
	public String getDesignation() {
		return this.designation;
	}

	@Override
	public Employee onBoard() {
		return new Intern(name,surname,designation);
	}
}
