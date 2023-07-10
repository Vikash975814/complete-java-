class Node
{
    Node [] children=new Node[26];
    boolean eow=false;
}
class Trie {
 Node root;
    public Trie() {
        root=new Node();
    }
    public boolean startsWith(String prefix) {
         Node temp=root;
         for(int i=0;i<prefix.length();i++)
         {
             int idx=prefix.charAt(i)-'a';
             if(temp.children[idx]==null)
             {
                 return false;
             }
             temp=temp.children[idx];
         }
         return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
