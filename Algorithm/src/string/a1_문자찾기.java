package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1_����ã�� {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char c = br.readLine().charAt(0);
		
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		int len = str.length();
		int cnt = 0;
		for(int i = 0; i < len; ++i)
		{
			if(str.charAt(i) == c) {
				++cnt;
			}
		}
		
		System.out.println(cnt);
	}

}

/*

����

�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.


�Է�
ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.


���
ù �ٿ� �ش� ������ ������ ����Ѵ�.

*/