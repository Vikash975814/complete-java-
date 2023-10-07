public class Main
{
    public static void 	consucativeOne(int n,int i,String ans)
    {
    if(n==0)
    {
            System.out.println(ans);
            return;
        }
    consucativeOne(n-1,0,ans+"0");
    if(i==0)
    {
        consucativeOne(n-1,1,ans+"1");
    }
    }
	public static void main(String[] args) {
		consucativeOne(3,0,"");
	}
}
