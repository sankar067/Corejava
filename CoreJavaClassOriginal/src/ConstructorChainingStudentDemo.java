
public class ConstructorChainingStudentDemo {

	/*
	 *    Constructor Chaining -Calling one constructor from another constructor(syntax: this(constructor parameter);)
	 *    Always invoking constructor statement should be the first statement(which is must be first statement)
	 */
	
	int deptno;
	String name, college;
	
	public ConstructorChainingStudentDemo(int deptno){
		this.deptno=deptno;
	}
	
	public ConstructorChainingStudentDemo(int deptno,String name){
//		this.deptno=deptno;
		this(deptno); // Constructor call must be the first statement in a constructor.To remove the error comment first statement.
		this.name=name;
	}
	
	public ConstructorChainingStudentDemo(int deptno,String name,String college){
		this(deptno,name);
		this.college=college;
	}
	
	public static void main(String[] args){
		
		ConstructorChainingStudentDemo student= new ConstructorChainingStudentDemo(1001,"Sankar","RIT");
		
		System.out.println("Student details - Dept No: "+student.deptno+", Name: "+student.name+", College: "+student.college);
	
	}
	
	/*
	 * output
	 * Student details - Dept No: 1001, Name: Sankar, College: RIT
	 */
}
