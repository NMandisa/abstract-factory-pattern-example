/**
 * 
 */
package za.co.fynbos.abstractfactory.employee.factories;

import za.co.fynbos.entity.Employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class EmployeeFactory {
	
	private Employee employee;
	
	public EmployeeFactory() {
	}

	public Employee getEmployee(Employee employee) {
		return this.employee=employee;
	}

	@Override
	public String toString() {
		return "EmployeeFactory [employee=" + employee.getName() +" "+employee.getSurname() +" " + employee.getDesignation() + "]";
	}

	
	
}
