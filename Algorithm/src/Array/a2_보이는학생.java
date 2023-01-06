package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class a2_보이는학생 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> nArray = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; ++i) {
			nArray.add(Integer.parseInt(st.nextToken()));
		}
		
		int high = 0;
		int cnt = 0;
		for (Integer m : nArray) {
			if(m > high) {
				cnt++;
				high = m;
			}
		}
		
		System.out.println(cnt);
	}
}

/*
설명
선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
입력
첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
출력
선생님이 볼 수 있는 최대학생수를 출력한다.
*/