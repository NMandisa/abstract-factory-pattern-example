/**
 * 
 */
package za.co.fynbos.abstractfactory.employee.types;

import za.co.fynbos.entity.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class LeasedEmployee extends Employee{

	private String companyName;
	private String name;
	private String surname;
	private String designation;
	
	
	public LeasedEmployee(){super();}  //default constructor
	public LeasedEmployee(String name,String surname) //constructor taking 2 arg 
	{
		this.name=name;
		this.surname=surname;
	} 
	public LeasedEmployee(String name,String surname,String designation)//constructor taking 4 arg 
	{
		this.name=name;
		this.surname=surname;
		this.designation=designation;
	} 
	
	public LeasedEmployee(String companyName,String name,String surname,String designation)//constructor taking 4 arg 
	{
		this.companyName=companyName;
		this.name=name;
		this.surname=surname;
		this.designation=designation;
	} 
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
