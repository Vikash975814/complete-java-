import java.io.FileWriter;
import java.io.IOException;
public class WriteCharFile {
	public static void main(String[] args) {
    FileWriter fw = null;
    String data="this is data";
    	try {
    		fw=new FileWriter("src/java.txt");
    		fw.write(data);
    		System.out.println("File created");
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    	try {
    		fw.close();
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
	}

