class Solution {
    public int addDigits(int num) {
        int n=0,res,s;
        while(num>9){
            n=num;
            num=0;
            while(n!=0){
                s=n%10;
                num=num+s;
                n=n/10;
            }
        }
        return num;
    }
}
