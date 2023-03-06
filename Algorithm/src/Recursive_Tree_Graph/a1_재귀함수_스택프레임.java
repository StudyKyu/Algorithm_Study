package Recursive_Tree_Graph;

public class a1_재귀함수_스택프레임 {
	
	// 재귀함수
	public static void Recursive(int n) {
		
		if(n == 0) return;
		else {
			Recursive(n-1);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		Recursive(3);
	}

}

/*

재귀함수

자연수 N이 입려되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램 작성

*/