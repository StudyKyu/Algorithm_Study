package HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class a4_모든아나그램찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String t = br.readLine();
		
		HashMap<Character, Integer> sm = new HashMap<>();
		HashMap<Character, Integer> tm = new HashMap<>();
		
		for(char x : t.toCharArray()) {
			tm.put(x,  tm.getOrDefault(x, 0) + 1);
		}
		
		int cnt = 0;
		int l = t.length()-1;
		for(int i = 0; i < l; ++i) {
			sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0) + 1);
		}
		int lt = 0;
		for(int rt = l; rt < s.length(); rt++) {
			sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0) + 1);
			if(sm.equals(tm)) 
				cnt++;
			sm.put(s.charAt(lt), sm.get(s.charAt(lt))-1);
			if(sm.get(s.charAt(lt)) == 0)
				sm.remove(s.charAt(lt));
			lt++;
		}
		
		System.out.println(cnt);
	}

}

/*

설명

S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.


예시 입력 1 
bacaAacba
abc

예시 출력 1
3
힌트

*/