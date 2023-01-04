package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a6_�ߺ��������� {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Boolean[] alpha = new Boolean[26];
		Arrays.fill(alpha, false);
		
		StringBuilder sb = new StringBuilder();
		int len = str.length();
		for(int i = 0; i < len; ++i) {
			if(alpha[str.charAt(i) - 97] == false) {
				sb.append(str.charAt(i));
				alpha[str.charAt(i) - 97] = true;
			}
		}
		
		System.out.println(sb.toString());
	}

}

/*
����

�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.

�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.


�Է�
ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.
*/