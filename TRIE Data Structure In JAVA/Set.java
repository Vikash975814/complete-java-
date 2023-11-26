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
    public boolean search(String word) {
         Node curr=root;
         for(int i=0;i<word.length();i++)
         {
             int idx=word.charAt(i)-'a';
             Node node=curr.children[idx];
             if(node==null)
             {
                 return false;
             }
             if(i==word.length()-1 && node.eow==false)
             {
                 return false;
             }
             curr=curr.children[idx];
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
