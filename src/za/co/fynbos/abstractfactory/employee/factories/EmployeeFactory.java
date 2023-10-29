/**
 * 
 */
package za.co.fynbos.abstractfactory.employee.factories;

import za.co.fynbos.abstractfactory.employee.Employee;

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

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
