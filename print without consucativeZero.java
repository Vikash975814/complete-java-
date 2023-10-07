public class Main
{
    public static void 	consucativeZero(int n,int i,String ans)
    {
    if(n==0)
    {
            System.out.println(ans);
            return;
        }
    consucativeZero(n-1,1,ans+"1");
    if(i==1)
    {
        consucativeZero(n-1,0,ans+"0");
    }
    }
	public static void main(String[] args) {
		consucativeZero(3,1,"");
	}
}
