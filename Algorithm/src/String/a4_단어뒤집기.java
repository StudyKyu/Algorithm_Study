package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a4_�ܾ������ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb;
		
		while(n-- > 0)
		{
			String str = br.readLine();
			int len = str.length();
			sb = new StringBuffer();
			for(int i = len-1; i >= 0; --i)
			{
				sb.append(str.charAt(i));
			}
			
			System.out.println(sb.toString());
		}
	}
}

/*
����
N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
*/