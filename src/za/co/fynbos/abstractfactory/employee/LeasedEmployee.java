/**
 * 
 */
package za.co.fynbos.abstractfactory.employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public abstract class LeasedEmployee {

	public abstract String getCompanyName();
	public abstract String getName();
	public abstract String getSurname();
	public abstract String getDesignation();
	
	@Override
	  public String toString() {
		  return "Company Name :"+this.getName()+"/n Name :"+getName()+"/n Surname :"+getSurname()+"/n  Designation :"+getDesignation();
	  }

}
