package Two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a5_연속된자연수의합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int len = n / 2 + 1;
		for(int i = 1; i <= len; ++i) {
			int sum = 0;
			for(int j = i; j <= len; ++j) {
				sum += j;
				
				if(n == sum) {
					cnt++;
					break;
				} else if(n < sum) {
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}
}

/*

설명

N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

만약 N=15이면

7+8=15

4+5+6=15

1+2+3+4+5=15

와 같이 총 3가지의 경우가 존재한다.

입력
첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

출력
첫 줄에 총 경우수를 출력합니다.

예시 입력 1 
15

예시 출력 1
3

*/