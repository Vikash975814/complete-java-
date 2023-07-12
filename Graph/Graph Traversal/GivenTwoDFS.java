import java.util.*;
public class DepthFirstSearch {
	static class Edge{
		int src;
		int dest;
		public Edge(int s,int d)
		{
			this.src=s;
			this.dest=d;
		}
	}
	public static void CreateGraph(ArrayList<Edge> graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,1));
		graph[1].add(new Edge(1,2));
		graph[2].add(new Edge(2,1));
		graph[3].add(new Edge(3,4));
		graph[4].add(new Edge(4,3));
	}
	  public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[])
	  {
		  System.out.print(curr+" ");
		  vis[curr]=true;
		  for(int i=0;i<graph[curr].size();i++)
		  {
			  Edge e=graph[curr].get(i);
			  if(vis[e.dest]==false)
				  dfs(graph,e.dest,vis);
		  }
	  }
		public static void main(String[] args) {
		int v=5;
		ArrayList<Edge> graph[]=new ArrayList[v];
		CreateGraph(graph);
		boolean vis[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(vis[i]==false)
			{
		dfs(graph,i,vis);
			}
		}
		System.out.println();
}
}
