package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a10_����ª�����ڰŸ� {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		char t = st.nextToken().charAt(0);
		
		int left = 0, right = 0;
		StringBuilder sb = new StringBuilder();
		
		int len = s.length();
		for (int i = 0; i < len; i++) {
			int cnt = 0;
			if(s.charAt(i) == t) {
				sb.append(cnt);
				continue;
			}
			
			left = i-1;
			right = i+1;
			cnt++;
			for(int j = i; ; ++j) {
				if(left < 0 && right > len-1)
					break;
				
				if(left >= 0 && s.charAt(left) == t) {
					sb.append(cnt);
					break;
				}
				else if(right < len && s.charAt(right) == t) {
					sb.append(cnt);
					break;
				}
				
				left--;
				right++;
				cnt++;
			}
		}
		
		for(int i = 0; i < len; ++i) {
			System.out.print(sb.charAt(i) + " ");
		}
	}
}

/*

����

�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.

�Է�
ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
���ڿ��� ���̴� 100�� ���� �ʴ´�.


���
ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.

*/