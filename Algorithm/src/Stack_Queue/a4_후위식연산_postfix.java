package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class a4_후위식연산_postfix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		Stack<Integer> stack = new Stack<>();
		
		for (Character c : str.toCharArray()) {
			if(c >= 48 && c <= 57) {
				stack.push(Character.getNumericValue(c));
			} else {
				int a = stack.pop();
				int b = stack.pop();
				
				int value = 0;
				if(c == '+') {
					value = b + a;
				} else if (c == '-') {
					value = b - a;
				} else if (c == '*') {
					value = b * a;
				} else {
					value = b / a;
				}
				
				stack.push(value);
			}
		}
		
		System.out.println(stack.peek());
	}
}

/*

설명

후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.

만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

입력
첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.

식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

출력
연산한 결과를 출력합니다.

예시 입력 1 
352+*9-

예시 출력 1
12

*/