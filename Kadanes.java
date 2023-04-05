public class function{
    public static void kadanes(int n[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n.length;i++){
            cs=cs+n[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }
        public static void main(String s[])   {
            int n[]={-2,-3,4,-1,-2,1,5,-3};
            kadanes(n);
        }
 
}
