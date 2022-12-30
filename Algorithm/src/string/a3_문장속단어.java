package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a3_����Ӵܾ� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int len = str.length;
		
		int maxIdx = 0;
		int maxLen = 0;
		
		for (int i = 0; i < len; i++) {
			if(str[i].length() > maxLen) {
				maxIdx = i;
				maxLen = str[i].length();
			}
		}
		
		System.out.println(str[maxIdx]);
	}
}

/*
����

�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
������� �� �ܾ�� �������� ���е˴ϴ�.

�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

���
ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��
�ܾ ������ �մϴ�.
*/