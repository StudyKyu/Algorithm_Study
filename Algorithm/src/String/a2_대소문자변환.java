package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2_��ҹ��ں�ȯ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int len = str.length();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < len; ++i)
		{
			char c = str.charAt(i);
			
			if(c > 'Z') {
				sb.append((char)(c - 32));
			}
			else {
				sb.append((char)(c + 32));
			}
		}
		
		System.out.println(sb.toString());
	}
}

/*
����
�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.
*/