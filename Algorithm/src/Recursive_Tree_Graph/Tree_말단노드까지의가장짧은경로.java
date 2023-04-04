package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node3 {
	int data;
	Node3 lt, rt;
	public Node3(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Tree_말단노드까지의가장짧은경로 {
	static Node3 root;
	public static int DFS(int L, Node3 root) {
		
		if(root.lt == null && root.rt == null) {
			return L;
		}
		else {
			return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
		}
	}
	
	public static int BFS(Node3 root) {
		Queue<Node3> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; ++i) {
				Node3 cur = Q.poll();
				if(cur.lt == null && cur.rt == null) return L;
				if(cur.lt != null) Q.offer(cur.lt);
				if(cur.rt != null) Q.offer(cur.rt);
			} 
			L++;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		root = new Node3(1);
		root.lt = new Node3(2);
		root.rt = new Node3(3);
		root.lt.lt = new Node3(4);
		root.lt.rt = new Node3(5);
//		System.out.println(DFS(0, root));
		System.out.println(BFS(root));
	}

}
