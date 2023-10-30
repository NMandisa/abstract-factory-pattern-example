/**
 * 
 */
package za.co.fynbos.abstractfactory.employee.factories;

import za.co.fynbos.abstractfactory.EmployeeAbstractFactory;
import za.co.fynbos.abstractfactory.employee.types.PartTime;
import za.co.fynbos.entity.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class PartTimeFactory implements EmployeeAbstractFactory{
	
	private String name;
	private String surname;
	private String designation;
	
	public PartTimeFactory(String name, String surname, Long taxNumber, String designation)// constructor taking 4 arg
	{
		this.name = name;
		this.surname = surname;
		this.designation = designation;
	}

	@Override
	public Employee onBoard() {
		return new PartTime(name,surname,designation);
	}

	@Override
	public String toString() {
		return "PartTimeFactory [name=" + name + ", surname=" + surname + ", designation=" + designation + "]";
	}
	
	

}
