class Command{
    int  numbers(String a[]){
        if(a.length==0){
      System.out.println("Enter the command line Arguments");
      return 0;
        }else{
            int sum=0;
            for(int i=0;i<a.length;i++){
               sum+=Integer.parseInt(a[i]);
            }
            return sum;
        }
    }
}
public class LabManual {
    public static void main(String s[]){
        Command d=new Command();
        System.out.println("Sum is= "+d.numbers(s));
    }
}
