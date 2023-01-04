package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class a2_���̴��л� {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> nArray = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; ++i) {
			nArray.add(Integer.parseInt(st.nextToken()));
		}
		
		int high = 0;
		int cnt = 0;
		for (Integer m : nArray) {
			if(m > high) {
				cnt++;
				high = m;
			}
		}
		
		System.out.println(cnt);
	}
}

/*

����

�������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�

�������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)


�Է�
ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.


���
�������� �� �� �ִ� �ִ��л����� ����Ѵ�.

*/