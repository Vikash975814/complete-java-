
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteBinaryFile {
	public static void main(String[] args) {
    FileOutputStream fw = null;
    String data="this is data is the content";
    	try {
    		fw=new FileOutputStream("src/vikash.java");
    		fw.write(data.getBytes());
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

