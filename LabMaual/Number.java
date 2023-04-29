class Number{
    private double x;
    Number(int x){
        this.x=x;
    }
    boolean iszero(){
        if(x==0)
        return true;
        else
        return false;
    }
    boolean ispositive(){
          if(x>0)
          return true;
          else
          return false;
    }
    boolean isnegative(){
        if(x<0)
        return true;
        else
        return false;
    }
    boolean isodd(){
      if(x%2!=0)
      return true;
      else
      return false;
    }
    boolean iseven(){
        if(x%2==0)
        return true;
        else
        return false;
    }
    boolean isprime(){
      double count=1;
      for(int i=2;i<=x;i++)
      {
        if(x%i==0)
        count++;
      }     
      if(count==2)
      return true;
      else
      return false;
    }
    boolean isarmstrong(){
    double m,temp,sum=0;
     temp=x;
     while(x>0){
        m=x%10;
        sum=sum+m*m*m;
        x=x/10;
     }
     if(sum==temp)
     return true;
     else
     return false;
    }
}
public class Main{
    public static void main(String s[]){
        Number n=new Number(153);
        System.out.println("Zero="+n.iszero());
        System.out.println("positive="+n.ispositive());
        System.out.println("Negative="+n.isnegative());
        System.out.println("Odd="+n.isodd());
        System.out.println("Even="+n.iseven());
        System.out.println("Prime="+n.isprime());
        System.out.println("Armstrong="+n.isarmstrong());
    }
}
