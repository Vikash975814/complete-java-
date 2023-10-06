class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
         ArrayList<Integer> list=new ArrayList<>();
         HashMap<Integer,Integer> hp=new HashMap<>();
         for(int i=0;i<n;i++)
         {
             hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
             if(hp.get(arr[i])==2)
             {
                 list.add(arr[i]);
             }
         }
             if(list.size()==0)
             {
                 list.add(-1);
                 return list;
             }
             Collections.sort(list);
           return list;
         }
}
