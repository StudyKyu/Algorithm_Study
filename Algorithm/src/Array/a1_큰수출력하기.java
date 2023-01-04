package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class a1_큰수출력하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Integer[] nNum = new Integer[n];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			nNum[i] = Integer.parseInt(st.nextToken());
		}
		
		// 이것도 가능
//		int left = 0;
//		for(int i = 0; i < n; ++i) {
//			left = i - 1;
//			if(left >= 0) {
//				if(nNum[i] > nNum[left]) {
//					System.out.print(nNum[i] + " ");
//				}
//				else {
//					continue;
//				}
//			}
//		}
		
		ArrayList<Integer> result = new ArrayList<>();
		result.add(nNum[0]);
		for(int i = 1; i < n; ++i) {
			if(nNum[i] > nNum[i-1]) {
				result.add(nNum[i]);
			}
		}
		
		for (Integer m : result) {
			System.out.print(m + " ");
		}
	}
}


/*

설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

*/