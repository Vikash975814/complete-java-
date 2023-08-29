class Solution {
    public void reverse(char arr[],int i,int j)
{
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
       char arr[]=s.toCharArray();
       int i=0;
       int j=arr.length;
       while(i<j)
       {
           int n=Math.min(i+k-1,j-1);
           reverse(arr,i,n);
           i=i+2*k;
       }
       return new String(arr);
    }
}
