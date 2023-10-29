package za.co.fynbos.abstractfactory.employee;

/**
 * @author Noxolo.Mkhungo
 *
 */
public abstract class Employee {
  public  abstract String getName();
  public abstract String getSurname();
  public abstract long getTaxNumber();
  public abstract String getDesignation();
  
  @Override
  public String toString() {
	  return "Name :"+this.getName()+"/n Surname :"+getSurname()+"/n  Designation :"+getDesignation()+"/n Tax No. :"+getTaxNumber();
  }
}
