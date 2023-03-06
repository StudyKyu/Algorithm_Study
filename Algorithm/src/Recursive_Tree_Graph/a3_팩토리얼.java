package Recursive_Tree_Graph;

public class a3_팩토리얼 {

	public static int Recursive(int n) {
		if(n == 1)
			return 1;
		else {
			return n * Recursive(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Recursive(5));
	}

}

/*

자연수 N이 입력되면 N!를 구하는 프로그램 작성

*/