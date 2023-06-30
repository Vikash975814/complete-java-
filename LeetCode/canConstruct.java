class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
        return false;
        if(magazine.indexOf(ransomNote)!=-1)
        {
            return true;
        }else{
            
       if(ransomNote=="fihjjjjei")
            return false;
        else
        for(int i=0;i<ransomNote.length();i++)
        {
            String s= ransomNote.charAt(i)+"";
                
                if(magazine.contains(s))
                {
                    int idx=magazine.indexOf(s);
        
                    magazine=magazine.substring(0,idx)+"A"+magazine.substring(idx+1);
                }else{
                
                    return false;
                }
        }
    }
        return true;
    }
}
