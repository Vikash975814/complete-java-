
import java.net.*;
import java.io.*;
public class ExceptionUser{
	public static void main(String s[]) throws Exception{
		URL yahoo=new URL("https://yahoo.com");
		BufferedReader sc=new BufferedReader(new InputStreamReader(yahoo.openStream()));
		String input;
		while((input=sc.readLine())!=null) {
			System.out.println(input);
		}
				
	}
