package Recursive_Tree_Graph;

class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class a5_이진트리순회_깊이우선탐색 {
	
	static Node root;
	public static void DFS(Node root) {
		if(root == null) {
			return;
		}
		else {
			DFS(root.lt);
			DFS(root.rt);
			System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		root.rt.lt = new Node(6);
		root.rt.rt = new Node(7);
		DFS(root);
	}

}
