import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadCharFile {
	public static void main(String[] args) {
	File f=new File("src/Welcome.java");
    FileReader fr = null;
    int ch;
    if(f.exists()) {
    	try {
    		fr=new FileReader(f);
    		try {
    			while((ch=fr.read())!=-1) {
    				System.out.print((char)(ch));
    			}
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    	}catch(FileNotFoundException e) {
    		e.printStackTrace();
    	}
    	try {
    		fr.close();
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
	}

}



