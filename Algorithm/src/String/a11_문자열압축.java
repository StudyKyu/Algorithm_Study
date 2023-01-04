package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a11_문자열압축 {

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

설명

알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
단 반복횟수가 1인 경우 생략합니다.

입력
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력
첫 줄에 압축된 문자열을 출력한다.

*/