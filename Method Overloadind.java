class Sum{
    int add(int a,int b){
        return a+b;
    }
    float add(float c){
        return c;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Construter{
    public static void main(String s[]){
        Sum s1=new Sum();
        System.out.println(s1.add(55,55));
        System.out.println(s1.add(55.5f));
        System.out.println(s1.add(55,55,55));
    }
}
