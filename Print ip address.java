import java.io.*;
import java.net.*;
public class User{
	public static void main(String s[]) {
		try {
			System.out.println("Local host Address");
			InetAddress ip=InetAddress.getLocalHost();
			System.out.println(ip.getHostAddress());
			System.out.println("Google host Address");
			InetAddress input=InetAddress.getByName("google.com");
			System.out.println(input.getHostAddress());
			System.out.println("Yahoo All host Address");
			InetAddress ipall[]=InetAddress.getAllByName("yahoo.com");
			for(InetAddress a:ipall) {
				System.out.println(a.getHostAddress());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
c
