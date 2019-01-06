import java.io.Serializable;
import java.util.ArrayList;

/*
 * A class implements Serializable interface then it set to be bean
 * 
 * Conversion of object to byte stream is called marshaling
 * byte stream to object is called un-marshaling.
 * 
 * thereare no mathod in java.io.serializable.
 * this is called
 * nullable interface or markable interface or taggable interface 
 * it's tacken care by JVM
 * 
 */
public class EmployeeBeanDemo implements Serializable {
int eno;
String ename;
int sal;
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}

ArrayList<EmployeeBeanDemo> employees = new ArrayList<EmployeeBeanDemo>();

void CreateEmployee(){
	EmployeeBeanDemo eb1= new EmployeeBeanDemo();
	eb1.setEno(10001);
	eb1.setEname("Sankar");
	eb1.setSal(10000);
	EmployeeBeanDemo eb2= new EmployeeBeanDemo();
	eb2.setEno(10002);
	eb2.setEname("tikina");
	eb2.setSal(10000);
	
}

void retriveEmployee(){
	for(EmployeeBeanDemo  emp : employees ){
		System.out.println("eno "+emp.getEno());
		System.out.println("sal "+emp.getSal());
		System.out.println("name "+emp.getEname());

	}
}

public static void main(String[] args){
	EmployeeBeanDemo ebd = new EmployeeBeanDemo();
	ebd.retriveEmployee();
}

}
