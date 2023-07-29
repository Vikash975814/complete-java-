class Solution {
    public int maxProfit(int[] prices) {
        int mplst=0,leastsf=prices[0];
        int dpl[]=new int[prices.length];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<leastsf)
            {
                leastsf=prices[i];
            }
            mplst=prices[i]-leastsf;
            if(mplst>dpl[i-1]){
                dpl[i]=mplst;
            }else{
                dpl[i]=dpl[i-1];
            }
        }
        int mprbt=0,mayat=prices[prices.length-1];
        int dpr[]=new int[prices.length];
        for(int i=prices.length-2;i>=0;i--)
        {
            if(prices[i]>mayat)
            {
                mayat=prices[i];
            }
            mprbt=mayat-prices[i];
            if(mprbt>dpr[i+1])
            {
                dpr[i]=mprbt;
            }else{
                dpr[i]=dpr[i+1];
            }
        }
        int op=0;
        for(int i=0;i<prices.length;i++)
        {
            if(dpl[i]+dpr[i]>op)
            op=dpl[i]+dpr[i];
        }
        return op;
    }
}
