import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Write a program to read file or directory. if directory then list all file, directory and sub directory list.
 * if file then read content
 */

public class InputStreamPractice {

	void getDirOrfile(String FileType){
		
		try{
			File f = new File(FileType);
			if(f.isDirectory()){
//				String path=f.getAbsolutePath();
			File[] file=f.listFiles();

			for(int i=0;i<file.length;i++){
				System.out.println("File Name :- " +(i+1)+" : " + file[i]);
								
				if (file[i].isDirectory()){
					File[] subFilelst=file[i].listFiles();
					for(int j=0;j<subFilelst.length;j++){
						System.out.println("Sub File Name :- " +(j+1)+" : " + subFilelst[j]);
					}
				}else {
					System.out.println("Its File: "+file[i]);
				}
			}
			
		}else if(f.isFile()){
//			FileInputStream fis= null;		
			FileReader  fr =null;
			try{
				fr = new FileReader(f);
				while(fr.read()!=-1){
					System.out.println(" File content : "+(char) fr.read());
				}
			}catch(Exception e){
					e.printStackTrace();
				}
			finally{
				fr.close();
			}
		}
		}catch(Exception e){
			System.out.println("Invalid Director or file");
			e.printStackTrace();
		}
}
		
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter directory or File path:");
		String df=dis.readLine();
		
		InputStreamPractice isp= new InputStreamPractice();
		isp.getDirOrfile(df);
		
	}

}
