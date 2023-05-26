import java.util.*;
@SuppressWarnings("serial")
class Check extends Exception{
	String msg;
	Check(String msg){
		this.msg=msg;
	}
	public String toStr() {
		return msg;
	}
}
class Canvote{
	int age;
	void checkAge(int age) throws Check
	{
		if(age<18) {
			throw new Check("You can not vote");
		}else {
			System.out.println("You can vote");
		}
	}
}
public class ExceptionUser {

	public static void main(String[] args) {
	
		Canvote c=new Canvote();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Age");
		int n=sc.nextInt();
		try {
			c.checkAge(n);
		}catch(Check e) {
			System.out.println(e.toStr());
		}
	}

}
