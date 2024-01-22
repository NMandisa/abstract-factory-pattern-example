/**
 * 
 */
package za.co.fynbos.employee.types;

import za.co.fynbos.employee.EmployeeAbstractFactory;
import za.co.fynbos.entity.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class Temporary extends Employee implements EmployeeAbstractFactory {
	public Temporary() {
		super();
	} // default constructor

	public Temporary(String name, String surname) // constructor taking 2 arg
	{
		this.name = name;
		this.surname = surname;
	}

	public Temporary(String name, String surname,String designation)// constructor taking 4 arg
	{
		this.name = name;
		this.surname = surname;
		this.designation = designation;
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
		return new Temporary(name,surname,designation);
	}
}
