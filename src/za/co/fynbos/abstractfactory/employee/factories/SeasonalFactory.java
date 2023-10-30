/**
 * 
 */
package za.co.fynbos.abstractfactory.employee.factories;

import za.co.fynbos.abstractfactory.EmployeeAbstractFactory;
import za.co.fynbos.abstractfactory.employee.types.Intern;
import za.co.fynbos.abstractfactory.employee.types.Seasonal;
import za.co.fynbos.entity.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class SeasonalFactory implements EmployeeAbstractFactory{
	
	private String name;
	private String surname;
	private String designation;
	
	public SeasonalFactory(String name, String surname,String designation)// constructor taking 4 arg
	{
		this.name = name;
		this.surname = surname;
		this.designation = designation;
	}

	@Override
	public Employee onBoard() {
		return new Seasonal(name,surname,designation);
	}

	@Override
	public String toString() {
		return "SeasonalFactory [name=" + name + ", surname=" + surname + ", designation=" + designation + "]";
	}
	
	

}
