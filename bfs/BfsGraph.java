package bfs;

import java.util.*;

public class BfsGraph {
	
	private int visited;
	private LinkedList<Integer> list[];
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	BfsGraph(int v){
		visited = v;
		list = new LinkedList[v];
		for (int i=0; i < v; ++i)
			list[i] = new LinkedList();
	}
	
	void insertEdge(int a, int b) {
		list[a].add(b);
	}
	
	@SuppressWarnings("unchecked")
	void BreadthFirstSearch(int x) {
		boolean V[] = new boolean[visited];

	    @SuppressWarnings("rawtypes")
		LinkedList<Integer> Q = new LinkedList();

	    V[x] = true;
	    Q.add(x);

	    while (Q.size() != 0) {
	      x = Q.poll();
	      System.out.print(x + " ");

	      Iterator<Integer> I = list[x].listIterator();
	      while (I.hasNext()) {
	        int N = I.next();
	        if (!V[N]) {
	          V[N] = true;
	          Q.add(N);
	        }
	      }
	    }
		
	}

	public static void main(String[] args) {
		
		BfsGraph b = new BfsGraph(7);
		b.insertEdge(0, 1);
	    b.insertEdge(0, 2);
	    b.insertEdge(1, 3);
	    b.insertEdge(2, 4);
	    b.insertEdge(2, 6);
	    b.insertEdge(4, 5);
	    
	    b.BreadthFirstSearch(2);
		
	}

}
