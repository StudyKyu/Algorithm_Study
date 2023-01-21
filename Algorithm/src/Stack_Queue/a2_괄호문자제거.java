package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class a2_괄호문자제거 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		Queue<Character> q = new ConcurrentLinkedQueue<>();
		
		for (char c : str.toCharArray()) {
			if(c == '(') {
				q.add(c);
			} else if(c == ')') {
				q.remove();
			} else {
				if(q.isEmpty())
					sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
	}
}
