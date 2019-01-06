package jdbc.homework;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readPropertyFile {

	Properties pro;
	
	public readPropertyFile(){
		try{
			File src = new File("../CoreJavaClass/conf/database.properties");
			FileInputStream propertyfile= new FileInputStream(src);
			pro =new Properties();
			pro.load(propertyfile);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public String GetPropertyData(String sKey)
	{
		return  pro.getProperty(sKey);
	}
}
