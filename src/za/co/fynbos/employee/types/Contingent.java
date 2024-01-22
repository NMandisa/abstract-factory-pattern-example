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
public class Contingent extends Employee implements EmployeeAbstractFactory {
	
	public Contingent(){super();}  //default constructor
	public Contingent(String name,String surname) //constructor taking 2 arg constructor
	{
		this.name=name;
		this.surname=surname;
	} 
	public Contingent(String name,String surname,String designation)//constructor taking 4 arg constructor
	{
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
		return new Contingent(name,surname,designation);
	}
}
