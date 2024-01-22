package za.co.fynbos;

import za.co.fynbos.employee.types.FixedTerm;

public class App {
	
	public static void main(String[]arg) {	
		
		FixedTerm fixedtermEmployee =  new FixedTerm("Nox","Mk","Sys Eng");
		//not working yet still needs fixing
		System.out.println(fixedtermEmployee.toString());
	}

}
