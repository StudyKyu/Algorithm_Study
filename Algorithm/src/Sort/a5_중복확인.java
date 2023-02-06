package Sort;

import java.util.Scanner;
import java.util.StringTokenizer;

public class a5_중복확인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean result = true;
		
		for(int i = 0; i < n; ++i) {
			int j = i+1;
			while(j < n && j > 0) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else if(arr[j] == arr[j-1]) {
					result = false;
					break;
				}
				j--;
			}
			
			if(!result)
				break;
		}
		
		System.out.println(result == true ? "U" : "D");
	}
}
