package Recursive_Tree_Graph;

import java.util.Iterator;

public class a4_피보나치재귀_메모이제이션 {

	static int[] fibo;
	
	public static int Recursive(int n) {
		if(n == 1) {
			return fibo[n] = 1;
		} else if(n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = Recursive(n-2) + Recursive(n-1);
		}
	}
	
	
	
	public static void main(String[] args) {
		int n = 10;
//		System.out.println(Recursive(n));
		
		fibo = new int[n+1];
		Recursive(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}

}
