package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a9_���ڸ����� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		int len = str.length();
		for(int i = 0; i < len; ++i) {
			if(Character.isDigit( str.charAt(i) )) {
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println(Integer.parseInt(sb.toString())); 
	}
}

/*
����

���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.

���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.

�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.


�Է�
ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.


���
ù �ٿ� �ڿ����� ����մϴ�.
*/