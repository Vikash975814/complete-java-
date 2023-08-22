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
    
    public void insert(String word) {
        Node temp=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(temp.children[idx]==null)
            {
                temp.children[idx]=new Node();
            }
            if(i==word.length()-1)
            {
                temp.children[idx].eow=true;
            }
            temp=temp.children[idx];
        }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
