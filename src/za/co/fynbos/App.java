package za.co.fynbos;

import za.co.fynbos.abstractfactory.EmployeeAbstractFactory;
import za.co.fynbos.abstractfactory.employee.factories.EmployeeFactory;
import za.co.fynbos.abstractfactory.employee.factories.FixedTermFactory;
import za.co.fynbos.entity.Employee;

public class App {
	
	public static void main(String[]arg) {	
		
		FixedTermFactory fixedtermEmployee =  new FixedTermFactory("Nox","Mk","Sys Eng");
		Employee employee = new EmployeeFactory().getEmployee(fixedtermEmployee.onBoard());
		//not working yet still needs fixing
		System.out.println(employee.toString());
	}

}
