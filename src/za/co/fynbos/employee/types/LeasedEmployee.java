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
public class LeasedEmployee extends Employee implements EmployeeAbstractFactory {
	private String companyName;
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

	@Override
	public Employee onBoard() {
		return new LeasedEmployee(name,surname,designation,companyName);
	}
}
