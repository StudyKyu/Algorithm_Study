package Recursive_Tree_Graph;

public class a2_이진수출력_재귀 {

	public static void Recursive(int n) {
		if(n == 0)
			return;
		else {
			Recursive(n / 2);
			System.out.print((n % 2) + " ");
		}
	}
	
	public static void main(String[] args) {
		Recursive(11);
		
	}

}

/*

10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.

*/