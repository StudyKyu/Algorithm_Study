package Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a3_가위바위보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		ArrayList<Integer> arrayA = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arrayA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(sc.nextLine());
		ArrayList<Integer> arrayB = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arrayB.add(Integer.parseInt(st.nextToken()));
		}
		
		
		for(int i = 0; i < n; ++i) {
			if(arrayA.get(i) == arrayB.get(i)) {
				System.out.println("D");
			} else if (arrayA.get(i) == 1 && arrayB.get(i) == 3 || arrayA.get(i) == 2 && arrayB.get(i) == 1 || arrayA.get(i) == 3 && arrayB.get(i) == 2) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}
}

/*
A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
예를 들어 N=5이면
두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
예제 입력
5
2 3 3 1 3
1 1 2 2 3
예시 출력 1
A
B
A
B
D
*/