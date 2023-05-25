		import java.io.FileInputStream;
        import java.io.FileNotFoundException;
		import java.io.IOException;
		public class ReadBinaryFile {	
			public static void main(String[] args) {
		    FileInputStream fr = null;
		    int ch;
		    	try {
		    		fr=new FileInputStream("src/Welcome.java");
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
