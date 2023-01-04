package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a7_ȸ�����ڿ� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toLowerCase();
		
		// ���� ����
		int left = 0;
		// ������ ����
		int right = str.length() - 1;
		
		boolean result = true;
		// �������� ���� ū ����
		while(left < right) {
			if(str.charAt(left) == str.charAt(right)) {
				left++;
				right--;
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

�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.

�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.

���
ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.
*/