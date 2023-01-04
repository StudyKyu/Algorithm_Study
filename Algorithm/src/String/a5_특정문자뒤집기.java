package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a5_Ư�����ڵ����� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		int len = str.length();
		
		for (int i = len-1; i >= 0; --i) {
			if( Character.isAlphabetic(str.charAt(i)) ) {
				sb.append(str.charAt(i)); 
			}
		}
		
		int idx = 0;
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < len; ++i) {
			if( Character.isAlphabetic(str.charAt(i)) ) {
				sb2.append(sb.charAt(idx));
				idx++;
			}
			else {
				sb2.append(str.charAt(i));
			}
		}
		
		System.out.println(sb2.toString());
	}
	
	// �ٸ� Ǯ��
	public static String solution(String str) {
		String answer = "";
		
		char[] cArray = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(cArray[lt])) {
				lt++;
				continue;
			}  
			if(!Character.isAlphabetic(cArray[rt])) {
				rt--;
				continue;
			}
			
			char tmp = cArray[lt];
			cArray[lt] = cArray[rt];
			cArray[rt] = tmp;
			lt++;
			rt--;
		}
		
		answer = String.valueOf(cArray);
		
		return answer;
	}
}

/*
����

���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.


�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.


���
ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.
*/