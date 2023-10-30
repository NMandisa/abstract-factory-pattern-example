package za.co.fynbos.entity;

/**
 * @author Noxolo.Mkhungo
 *
 */
public abstract class Employee {
  public  abstract String getName();
  public abstract String getSurname();
  public abstract String getDesignation();
  
  @Override
  public String toString() {
	  return "Name :"+this.getName()+"/n Surname :"+getSurname()+"/n  Designation :"+getDesignation();
  }
}
