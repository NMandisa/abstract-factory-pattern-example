/**
 * 
 */
package za.co.fynbos.abstractfactory.employee.factories;

import za.co.fynbos.abstractfactory.EmployeeAbstractFactory;
import za.co.fynbos.abstractfactory.employee.Employee;
import za.co.fynbos.abstractfactory.employee.types.Intern;
import za.co.fynbos.abstractfactory.employee.types.Temporary;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class TemporaryFactory implements EmployeeAbstractFactory{
	
	private String name;
	private String surname;
	private Long taxNumber;
	private String designation;
	
	public TemporaryFactory(String name, String surname, Long taxNumber, String designation)// constructor taking 4 arg
	{
		this.name = name;
		this.surname = surname;
		this.taxNumber = taxNumber;
		this.designation = designation;
	}

	@Override
	public Employee onBoard() {
		return new Temporary(name,surname,taxNumber,designation);
	}

}
