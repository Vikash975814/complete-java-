class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean []prime=new boolean[n];
        Arrays.fill(prime,true);
        for(int i=2;i<n;i++)
        {
            if(prime[i])
            count++;
            for(int j=i+i;j<n;j+=i)
            {
                prime[j]=false;
            }
        }
        return count;
    }
}
