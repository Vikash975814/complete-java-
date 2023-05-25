
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyChar {
	public static void main(String[] args) {
	FileReader fr=null;	
    FileWriter fw = null;
    int ch;
    	try {
    		fr=new FileReader("src/Welcome.java");
    		fw=new FileWriter("src/Welcome1.java");
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

