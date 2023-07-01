package Hashing;
import java.util.*;
public class HashSetEx {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<String> hs=new HashSet<>();
       
      // Add In HashMap
       hs.add("Delhi");
       hs.add("Noida");
       hs.add("Noida");
       hs.add("Bangluru");
       hs.add("Bihar");
       
       // Remove In HashMap
       hs.remove("Delhi");
       
    // Contains In HashMap
       System.out.println(hs.contains("Noida"));
       System.out.println(hs);
       
    // Inhance loop In HashMap
       for(String s:hs)
       {
    	   System.out.println(s);
       }
       
       // Iterator in HashMap
       Iterator it=hs.iterator();
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       
       //Linked HashSet
       LinkedHashSet<String> lhs=new LinkedHashSet<>();
       lhs.add("Delhi");
       lhs.add("Noida");
       lhs.add("Noida");
       lhs.add("Bangluru");
       lhs.add("Bihar");
       
       lhs.remove("Delhi");
       
       System.out.println(lhs.contains("Noida"));
       System.out.println(lhs);
       
       for(String s:lhs)
       {
    	   System.out.println(s);
       }
       
       //TreeSet
       TreeSet<String> ts=new TreeSet<>();
       ts.add("Delhi");
       ts.add("Noida");
       ts.add("Noida");
       ts.add("Bangluru");
       ts.add("Bihar");
       
       ts.remove("Delhi");
       
       System.out.println(ts.contains("Noida"));
       System.out.println(ts);
       
       for(String s:ts)
       {
    	   System.out.println(s);
       }
	}
}
