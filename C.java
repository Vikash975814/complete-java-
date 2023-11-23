
class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
      int length=Integer.MAX_VALUE;
      for(int i=0;i<n;i++)
      {
          int add=0;
          int j=i;
          while(j<n)
          {
              add+=a[j];
              if(add>x)
              {
                  length=Math.min(length,j-i+1);
                  break;
              }
              j++;
          }
      }
      return (length!=Integer.MAX_VALUE)?length:0;
    }
}
