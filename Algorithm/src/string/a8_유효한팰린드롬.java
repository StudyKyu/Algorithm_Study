package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a8_��ȿ���Ӹ���� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toLowerCase();
		
		int left = 0;
		int right = str.length() - 1;
		
		boolean result = true;
		while(left < right) {
			if(!Character.isAlphabetic(str.charAt(left))) {
				left++;
				continue;
			}
			
			if(!Character.isAlphabetic(str.charAt(right))) {
				right--;
				continue;
			}
			
			if(str.charAt(left) == str.charAt(right)) {
				left++;
				right--;
				continue;
			}
			else {
				result = false;
				break;
			}
		}
		
		System.out.println(result == true ? "YES" : "NO");
	}
}

/*
����

�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
���ĺ� �̿��� ���ڵ��� �����մϴ�.


�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.


���
ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.
*/