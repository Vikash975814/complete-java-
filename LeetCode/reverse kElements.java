import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Queue<Integer> reverseElements(Queue<Integer> q, int k){
  Stack<Integer> s=new Stack<>();
  for(int i=0;i<k;i++)
  {
    int curr=q.poll();
    s.push(curr);
  }
  while(!s.isEmpty()){
    int curr=s.pop();
    q.add(curr);
  }
  for(int i=0;i<q.size()-k;i++){
    int curr=q.poll();
     q.add(curr);
  }
  return q;
  }
}
