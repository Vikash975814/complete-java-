
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyBinary {
	public static void main(String[] args) {
	FileInputStream fr=null;	
    FileOutputStream fw = null;
    int ch;
    	try {
    		fr=new FileInputStream("C:\\Users\\vkgup\\OneDrive\\Desktop\\javaeclipse\\Files\\src/1.jpg");
    		fw=new FileOutputStream("C:\\Users\\vkgup\\OneDrive\\Desktop\\javaeclipse\\Files\\src/2.jpg");
    		while((ch=fr.read())!=-1)
    		{
    		fw.write(ch);
    		}
    		System.out.println("File copied");
    		}catch(FileNotFoundException e) {
    			e.printStackTrace();
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    	try {
    		fr.close();
    		fw.close();
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
	}

