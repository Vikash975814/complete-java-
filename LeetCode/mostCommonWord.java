class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        String[] words =str.split("\\s+");
        Set<String> word = new HashSet();
        for (String s : banned)
            word.add(s);
       Map<String, Integer> count = new HashMap(); 
        for (String s : words) {
            if (!word.contains(s))
                count.put(s, count.getOrDefault(s, 0) + 1);
        }
     return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
