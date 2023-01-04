package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a6_중복문자제거 {

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
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.
*/