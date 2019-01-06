import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	List<EmployeeBean> getEmployees(){
	
		List<EmployeeBean> emplist = new ArrayList<EmployeeBean>();
		Connection conn=null;
		Statement st = null;
//		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try{
			conn=TestJDBC.getConnection();
			System.out.println(conn);
			st=conn.createStatement();
			String Query="Select * from employee";
			rs=st.executeQuery(Query);
			
//			PreparedStatement ps=conn.prepareStatement("Select * from employee");
//			rs=ps.executeQuery();
			
			while(rs.next()){
				System.out.println("Employee Number :"+rs.getInt(1));// By Index
				System.out.println("Employee Name :"+rs.getString("ename"));
				
				EmployeeBean eb = new EmployeeBean();
				eb.setEno(rs.getInt(1));
				eb.setName(rs.getString("ename"));
				eb.setSal(rs.getInt("esal"));
				eb.setDept(rs.getInt(4));
				
				emplist.add(eb);
			}
		}catch(Exception e){e.printStackTrace();}
		
		finally{
			try{
				rs.close();rs=null;
				st.close();st=null;
				conn.close(); conn= null;		
			}catch(Exception e){
				e.getMessage();
			}		
		}
		return emplist;
	}
	public static void main(String[] args) {

		EmployeeService es = new EmployeeService();
		List<EmployeeBean> emplist = es.getEmployees();
		for(EmployeeBean emp : emplist){
			System.out.println("Employee no : "+emp.getEno());
			System.out.println("Employee name : "+emp.getName());
			System.out.println("Employee sal : "+emp.getSal());
			System.out.println("Employee dept : "+emp.getDept());
		}
 		

	}

}
