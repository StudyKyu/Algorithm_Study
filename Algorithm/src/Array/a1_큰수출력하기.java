package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class a1_ū������ϱ� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Integer[] nNum = new Integer[n];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			nNum[i] = Integer.parseInt(st.nextToken());
		}
		
		// �̰͵� ����
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

����

N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

(ù ��° ���� ������ ����Ѵ�)


�Է�
ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.


���
�ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.

*/