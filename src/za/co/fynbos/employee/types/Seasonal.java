package za.co.fynbos.employee.types;

import za.co.fynbos.employee.EmployeeAbstractFactory;
import za.co.fynbos.entity.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class Seasonal extends Employee implements EmployeeAbstractFactory {

	public Seasonal(){super();}  //default constructor
	public Seasonal(String name,String surname) //constructor taking 2 arg 
	{
		this.name=name;
		this.surname=surname;
	} 
	public Seasonal(String name,String surname,String designation)//constructor taking 4 arg 
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
		return new Seasonal(name,surname,designation);
	}
}
