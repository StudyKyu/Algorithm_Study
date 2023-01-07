package Array;

import java.util.Scanner;

public class a5_소수_에라토스테네스체 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean[] arr = new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i*i <= n; ++i) {
			if(!arr[i]) {
				for(int j = i*i; j <= n; j+=i) {
					arr[j] = true;
				}
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < n; ++i) {
			if(!arr[i])
				cnt++;
		}
		
		
		System.out.println(cnt);
	}

}

/*

설명

자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

입력
첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

출력
첫 줄에 소수의 개수를 출력합니다.

예시 입력 1 
20

예시 출력 1
8

*/