package Hashing;
import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap
      HashMap<Integer,String> hm=new HashMap<>();
      hm.put(1,"India");
      hm.put(2,"Bangloru");
      hm.put(3,"Delhi");
      hm.put(4,"Agra");
      hm.put(5,"Pakistan");
      System.out.println(hm);
      
      System.out.println(hm.get(1));
      
      System.out.println(hm.containsKey(1));
      
      hm.remove(1);
      System.out.println(hm);
      
      //LinkedHashMap
      
      LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
      lhm.put(1,"India");
      lhm.put(2,"Bangloru");
      lhm.put(3,"Delhi");
      lhm.put(4,"Agra");
      lhm.put(5,"Pakistan");
      System.out.println(lhm);
      
      System.out.println(lhm.get(1));
      
      System.out.println(lhm.containsKey(1));
      
      lhm.remove(1);
      System.out.println(lhm);
      
      // TreeSet
      TreeMap<Integer,String> tm=new TreeMap<>();
      tm.put(1,"India");
      tm.put(2,"Bangloru");
      tm.put(3,"Delhi");
      tm.put(4,"Agra");
      tm.put(5,"Pakistan");
      System.out.println(tm);
      
      System.out.println(tm.get(1));
      
      System.out.println(tm.containsKey(1));
      
      tm.remove(1);
      System.out.println(tm);
      
      
      HashMap<String,Integer> hm1=new HashMap<>();
      hm1.put("India",100);
      hm1.put("Bangloru",200);
      hm1.put("Delhi",300);
      hm1.put("Agra",400);
      hm1.put("Pakistan",500);
      System.out.println(hm1);
      
      System.out.println(hm1.get("India"));
      
      System.out.println(hm1.containsKey("India"));
      
      hm1.remove("India");
      System.out.println(hm1);
      
      //LinkedHashMap
      
      LinkedHashMap<String,Integer> lhm1=new LinkedHashMap<>();
      lhm1.put("India",100);
      lhm1.put("Bangloru",200);
      lhm1.put("Delhi",300);
      lhm1.put("Agra",400);
      lhm1.put("Pakistan",500);
      System.out.println(lhm1);
      
      System.out.println(lhm1.get("India"));
      
      System.out.println(lhm1.containsKey("India"));
      
      lhm1.remove("India");
      System.out.println(lhm1);
            // TreeSet
      TreeMap<String,Integer> tm1=new TreeMap<>();
      tm1.put("India",100);
      tm1.put("Bangloru",200);
      tm1.put("Delhi",300);
      tm1.put("Agra",400);
      tm1.put("Pakistan",500);
      System.out.println(tm1);
      
      System.out.println(tm1.get("India"));
      
      System.out.println(tm1.containsKey("India"));
      
      tm1.remove("India");
      System.out.println(tm1);
      	}
}
