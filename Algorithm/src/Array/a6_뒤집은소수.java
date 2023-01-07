package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class a6_뒤집은소수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n; ++i) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int maxLength = 100001;
		boolean[] sosu = new boolean[maxLength];
		sosu[0] = true;
		sosu[1] = true;
		for(int i = 2; i*i < maxLength; ++i) {
			if(!sosu[i]) {
				for(int j = i*i; j < maxLength; j+=i) {
					sosu[j] = true;
				}
			}
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		StringBuilder reverse;
		
		for(int i = 0; i < n; ++i) {
			int value = arr.get(i);
			reverse = new StringBuilder();
			while(value > 0) {
				int front =  value % 10;
				reverse.append(front);
				value /= 10;
			}
			
			int nCheckSosu = Integer.parseInt(reverse.toString());
			if(!sosu[nCheckSosu])
				result.add(nCheckSosu);
			
			
		}
		
		for (Integer m : result) {
			System.out.print(m + " ");
		}
	}

}

/*

설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.


예시 입력 1 
9
32 55 62 20 250 370 200 30 100

예시 출력 1
23 2 73 2 3
*/