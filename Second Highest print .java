import java.util.*;
public class Oops{
    public static void SecondHighest(int arr[],int n){
        Arrays.sort(arr);
        System.out.println("Second highest elements is the array "+arr[n-2]);

    }    
    public static void main(String s[]){
        int arr[]={1,3,4,10,9,10,34,44,43,32};
        SecondHighest(arr,10);
    }
}
