import java.util.*;
public class NxtGreatest {
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the size of Array");
   int n=sc.nextInt();
   int arr[]=new int[n];
   System.out.print("Enter the Array elemnt");
   for(int i=0;i<n;i++) {
	   arr[i]=sc.nextInt();
   }
   Stack<Integer> s=new Stack<>();
  int nxtgreater[]=new  int[arr.length];
	for(int i=0;i<arr.length;i++) {
		while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
			s.pop();
		}
		if(s.isEmpty()) {
			nxtgreater[i]=-1;
		}else {
			nxtgreater[i]=arr[s.peek()];
		}
		s.push(i);
	}
	for(int i=0;i<nxtgreater.length;i++) {
		System.out.print(nxtgreater[i]+" ");
	}
	System.out.println();
	}

}
