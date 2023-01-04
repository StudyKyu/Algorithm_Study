package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a11_���ڿ����� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		int len = str.length();
		
		int idx = 0;
		while(idx < len) {
			char c = str.charAt(idx);
			sb.append(c);
			
			int cnt = 0;
			for(int i = idx; i < len; ++i) {
				if(str.charAt(i) == c) {
					cnt++;
					idx++;
				}
				else {
					break;
				}
			}
			
			if(cnt > 1)
				sb.append(cnt);
		}
		
		
		System.out.println(sb.toString());
	}

}

/*

����

���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�
���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�� �ݺ�Ƚ���� 1�� ��� �����մϴ�.

�Է�
ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.

���
ù �ٿ� ����� ���ڿ��� ����Ѵ�.

*/