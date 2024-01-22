package za.co.fynbos.employee.types;

import za.co.fynbos.employee.EmployeeAbstractFactory;
import za.co.fynbos.entity.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class Permanent extends Employee implements EmployeeAbstractFactory {

	public Permanent(){super();}  //default constructor
	public Permanent(String name,String surname) //constructor taking 2 arg 
	{
		this.name=name;
		this.surname=surname;
	} 
	public Permanent(String name,String surname,String designation)//constructor taking 3 arg 
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
		return new Permanent(name,surname,designation);
	}
}
