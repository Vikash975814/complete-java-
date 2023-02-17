
       import java.util.*;
public class Sorting{
    public static void Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int Minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[Minpos]>arr[j]){
                    Minpos=j;
                }
            }
                    int temp=arr[Minpos];
                    arr[Minpos]=arr[i];
                    arr[i]=temp;

                }
            }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        public static void main(String s[]){
            int arr[]={5,4,1,3,2};
            Selection(arr);
            printarr(arr);
        }
    }
    
