package SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class a1_선택정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = 0;
		for(int i = 0; i < n-1; ++i) {
			min = i;
			
			for(int j = i+1; j < n; ++j) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			if(i != min) {
			  int temp = arr[i];
			  arr[i] = arr[min];
			  arr[min] = temp;
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}

/*

설명

N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

정렬하는 방법은 선택정렬입니다.


입력
첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.


출력
오름차순으로 정렬된 수열을 출력합니다.


예시 입력 1 
6
13 5 11 7 23 15

예시 출력 1
5 7 11 13 15 23

*/