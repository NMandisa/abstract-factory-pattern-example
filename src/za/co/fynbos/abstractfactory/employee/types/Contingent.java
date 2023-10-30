/**
 * 
 */
package za.co.fynbos.abstractfactory.employee.types;

import za.co.fynbos.entity.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class Contingent extends Employee {
	
	private String name;
	private String surname;
	private String designation;
	
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

}
