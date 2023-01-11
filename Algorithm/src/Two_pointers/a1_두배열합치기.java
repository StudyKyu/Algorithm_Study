package Two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class a1_두배열합치기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		for (int i = 0; i < m; i++) {
			arr2.add(Integer.parseInt(st.nextToken()));
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		int arr1Left = 0;
		int arr2Left = 0;
		while(arr1Left < n || arr2Left < m) {
			if(arr.get(arr1Left) < arr2.get(arr2Left)) {
				result.add(arr.get(arr1Left));
				arr1Left++;
			}
			else {
				result.add(arr2.get(arr2Left));
				arr2Left++;
			}
			
			if(arr1Left >= n) {
				for(int i = arr2Left; i < m; ++i) {
					result.add(arr2.get(i));
				}
				break;
			}
			
			if(arr2Left >= m) {
				for(int i = arr1Left; i < n; ++i) {
					result.add(arr.get(i));
				}
				break;
			}
		}
		
		for (Integer r : result) {
			System.out.print(r + " ");
		}
	}
}


/*

설명

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


출력
오름차순으로 정렬된 배열을 출력합니다.


예시 입력 1 
3
1 3 5
5
2 3 6 7 9

예시 출력 1
1 2 3 3 5 6 7 9

*/