class Blocks{
    static int a=10;

    static int add( int a,int b){
        return (a+b);
    }
    static int add(int a,int b,int c){
        return (a+b+c);
    }
}
public class LabManual{
    public static void main(String s[]){
        System.out.println(Blocks.a);
        System.out.println(Blocks.add(20,30));
        System.out.println(Blocks.add(20,30,40));

    }
}
