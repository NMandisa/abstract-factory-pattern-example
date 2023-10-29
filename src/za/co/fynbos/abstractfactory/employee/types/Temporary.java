/**
 * 
 */
package za.co.fynbos.abstractfactory.employee.types;

import za.co.fynbos.abstractfactory.employee.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class Temporary extends Employee {

	private String name;
	private String surname;
	private Long taxNumber;
	private String designation;

	public Temporary() {
		super();
	} // default constructor

	public Temporary(String name, String surname) // constructor taking 2 arg
	{
		this.name = name;
		this.surname = surname;
	}

	public Temporary(String name, String surname, Long taxNumber, String designation)// constructor taking 4 arg
	{
		this.name = name;
		this.surname = surname;
		this.taxNumber = taxNumber;
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
	public long getTaxNumber() {
		return this.taxNumber;
	}

	@Override
	public String getDesignation() {
		return this.designation;
	}

}
