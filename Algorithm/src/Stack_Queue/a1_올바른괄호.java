package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class a1_올바른괄호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		
		String result = "YES";
		for(int i = 0; i < str.length(); ++i) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			} else {
				if(!stack.isEmpty())
					stack.pop();
				else {
					result = "NO";
					break;
				}
			}
		}
		
		if(!stack.isEmpty()) {
			result = "NO";
		}
		
		System.out.println(result);
	}

}

/*

설명
괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

입력
첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

출력
첫 번째 줄에 YES, NO를 출력한다.


예시 입력 1 
(()(()))(()

예시 출력 1
NO

*/