/*
 * Bean
 * Declare variable then 
 * Source--> Generate Getters and Setters to create bean
 */
public class EmployeeBean {

	int eno;
	String name;
	int sal;
	int dept;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	
}
