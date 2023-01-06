package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a5_특정문자뒤집기 {

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
	
	// 다른 풀이
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
설명
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
*/