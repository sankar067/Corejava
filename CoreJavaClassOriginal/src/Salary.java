class Salary{
// calculate average salary of 2 employee?
int sal;
String empname;
int deptnum;
int emplid;

void print(){
	System.out.println("Average Salary Program");
}
public static void main(String[] arg){
Salary sa= new Salary();
sa.sal=20000;
sa.empname="Sankar";
sa.deptnum=1;
sa.emplid=101;

Salary sa1= new Salary();
sa1.sal=30000;
sa1.empname="Bala";
sa1.deptnum=1;
sa1.emplid=201;

int avgsal;
avgsal=(sa.sal+sa1.sal)/2;
sa.print();
System.out.println("Employee Name:"+sa.empname+",Employee Id:"+sa.emplid+",Salary:"+sa.sal);
System.out.println("Employee Name2:"+sa1.empname+",Employee Id2:"+sa1.emplid+",Salary2:"+sa1.sal);
System.out.println("Average Salary :"+avgsal);

/*
 * 
Average Salary Program
Employee Name:Sankar,Employee Id:101,Salary:20000
Employee Name2:Bala,Employee Id2:201,Salary2:30000
Average Salary :25000
 */
}
}
