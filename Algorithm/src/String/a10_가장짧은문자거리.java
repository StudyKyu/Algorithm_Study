package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a10_가장짧은문자거리 {
	
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
설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.
출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
*/