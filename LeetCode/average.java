class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=0;
       for(int i=1;i<salary.length-1;i++)
       {
        n=n+salary[i];
       }
      return (double) (n)/(salary.length-2);
    }
}
