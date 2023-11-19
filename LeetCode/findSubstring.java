class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s==null || s.length()==0 ||words==null ||words.length==0)
        {
            return new ArrayList<>();
        }
        Map<String,Integer> map=new HashMap<>();
        for(String word:words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
  int tw=words.length;
  int wc=words[0].length();
  List<Integer> list=new ArrayList<>();
  for(int i=0;i<=s.length()-tw*wc;i++)
  {
      Map<String,Integer> seen=new HashMap<>();
      for(int j=0;j<tw;j++)
      {
          int wi=i+j*wc;
          String word=s.substring(wi,wi+wc);
          if(!map.containsKey(word))
          {
              break;
          }
          seen.put(word,seen.getOrDefault(word,0)+1);
          if(seen.get(word)>map.getOrDefault(word,0)){
              break;
          }
          if(j+1==tw)
          {
              list.add(i);
          }
      }
  }
  return list;
    }
}
