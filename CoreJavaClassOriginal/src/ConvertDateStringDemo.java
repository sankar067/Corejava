import java.text.SimpleDateFormat;
import java.util.Date;

class testdate{
	void testdate(){
		Date dt = new Date();
		System.out.println("Date : "+dt);
	}
	
	void convertdatestring(){
		Date dt=new Date();
		SimpleDateFormat sdt=new SimpleDateFormat("dd-MM-yyyy");
		String dtstr=sdt.format(dt);
		System.out.println("Date String : "+dtstr);
	}
	
	void convertstringtodate(String date){
		String dt;
		SimpleDateFormat sdt=new SimpleDateFormat("MM/dd/yyyy");
		dt=sdt.format(date);
		System.out.println("Date String : "+dt);
	}
}

public class ConvertDateStringDemo {

	public static void main(String[] args){
		testdate td = new testdate();
		td.convertdatestring();
		td.convertstringtodate("09/12/2017");
	}
}
