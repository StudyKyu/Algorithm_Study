package Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a3_���������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		ArrayList<Integer> arrayA = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arrayA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(sc.nextLine());
		ArrayList<Integer> arrayB = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arrayB.add(Integer.parseInt(st.nextToken()));
		}
		
		
		for(int i = 0; i < n; ++i) {
			if(arrayA.get(i) == arrayB.get(i)) {
				System.out.println("D");
			} else if (arrayA.get(i) == 1 && arrayB.get(i) == 3 || arrayA.get(i) == 2 && arrayB.get(i) == 1 || arrayA.get(i) == 3 && arrayB.get(i) == 2) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}
}

/*

A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.

����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.

���� ��� N=5�̸�

�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.

�� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.

�� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.


���
�� �ٿ� �� ȸ�� ���ڸ� ����մϴ�. ����� ���� D�� ����մϴ�.

���� �Է�
5
2 3 3 1 3
1 1 2 2 3

���� ��� 1
A
B
A
B
D
*/
