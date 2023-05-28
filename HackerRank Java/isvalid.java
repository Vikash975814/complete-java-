import java.util.*;
public class Solution{
	public static boolean isvalid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        if(ch=='(' || ch=='{' || ch=='['){
            s.push(ch);
        }else{
            if(s.isEmpty()){
                return true;
            }
            if((s.peek()=='(' && ch==')')||(s.peek()=='{' && ch=='}')
            ||(s.peek()=='[' && ch==']')){
                s.pop();
            }else{
                return false;
            }
        }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
	public static void main(String []argh)
	{
        String str;
		Scanner sc = new Scanner(System.in);	
		while (sc.hasNext()) {
		 str=sc.next();
		}
       
		  System.out.println(isvalid(str));
	}
}


