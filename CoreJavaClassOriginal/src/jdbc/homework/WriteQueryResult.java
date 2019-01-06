package jdbc.homework;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class WriteQueryResult {

	public void writeData(String sData){
		 try{
		        
	            OutputStreamWriter writer = new OutputStreamWriter(
	                  new FileOutputStream("../CoreJavaClass/QueryResult.txt", true), "UTF-8");
	            BufferedWriter fbw = new BufferedWriter(writer);
	            fbw.write(sData);
	            fbw.newLine();
	            fbw.close();
	        }catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
		
	 }

}
