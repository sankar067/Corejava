import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

public class TestFiles {

	void getfiles(String filename){
		File f= new File(filename);
		System.out.println("name : "+f.getName());
		System.out.println("Size: "+f.getTotalSpace());
		System.out.println("Path : "+f.getAbsolutePath());
		System.out.println("time stamp : "+new Date(f.lastModified()));
	}
	
	void getDirectoryFile(String dirpath){
		
		File f= new File(dirpath);
	try{
		if (f.isDirectory()){
			System.out.println("This is directory...");
			String[] filenames= f.list();
			
			File[] filename = File.listRoots();
			System.out.println("No of file :"+filenames.length); // it includes directory as well
			
			System.out.println("No of root files using 2nd Method :"+filename.length);
			
			for(int i=0;i < filenames.length ;i++){
				System.out.println(" File names "+i+ " : "+filenames[i]);
			}
		}else if(f.isFile()){
			System.out.println("It is File");				
		}else{
			System.out.println("Invalid File");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}	
	
	void Readfile(String filename){
		File t = new File(filename);
		FileInputStream fis= null;
		int data;
		try{
			fis = new FileInputStream(filename);
//			while(fis.read() !=-1){
			while((data=fis.read()) !=-1){
				
//				System.out.println("The chars in File :"+(char)fis.read()); // it will print alternate char from file
				
				System.out.println("The chars in File :"+(char)data);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				fis.close();
				fis=null;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}



	public static void main(String[] args) {
		String filename="../CoreJavaClass/Test.txt";
		TestFiles tf= new TestFiles();
		tf.getfiles(filename);
		
		tf.getDirectoryFile(filename);
		
		tf.Readfile(filename);
		
	}

}
