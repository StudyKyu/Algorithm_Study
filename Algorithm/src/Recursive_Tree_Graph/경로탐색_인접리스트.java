package Recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_인접리스트 {
	static int n , m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	public static void DFS(int v) {
		if ( v == n ) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < m; ++i) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		
		for(int i = 0; i < m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		
		ch[1] = 1;
		DFS(1);
		System.out.println(answer);
	}

}
