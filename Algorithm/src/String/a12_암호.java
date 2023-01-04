package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a12_��ȣ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String signal = str.substring(i*7, (i+1) * 7);
			signal = signal.replace('#', '1');
			signal = signal.replace('*', '0');
			
			int count = 0;
			
			for(int j = 0; j < signal.length(); ++j) {
				if(signal.charAt(j) == '1') {
					count += (int)Math.pow(2,  6-j);
				}
			}
			
			sb.append((char)count);
		}
		
		System.out.println(sb.toString());
	}
}

/*

������ ���񿡰� ���ĺ� �빮�ڷ� ������ ��������� ���� ��ǻ�͸� �̿��� �����ϴ�.

��������� ������ ���� ���� ����� ��ȣ�� �����Ǿ� �ֽ��ϴ�.

��������� ���ĺ� �� ���ڸ��� # �Ǵ� *�� �ϰ� ���� �����Ǿ� �ֽ��ϴ�.

���� ������ ��#*****#������ ������ ���ڸ� ���´ٸ� ����� ������ ����� ��Ģ��� ������ ���� �ؼ��մϴ�.

1. ��#*****#���� �ϰ��ڸ��� �������� �ٲߴϴ�. #�� �������� 1��, *�������� 0���� ��ȯ�մϴ�. ����� ��1000001���� ��ȯ�˴ϴ�.

2. �ٲ� 2������ 10����ȭ �մϴ�. ��1000001���� 10����ȭ �ϸ� 65�� �˴ϴ�.

3. �ƽ�Ű ��ȣ�� 65���ڷ� ��ȯ�մϴ�. �� �ƽ�ũ��ȣ 65�� �빮�� 'A'�Դϴ�.

����� �빮�ڵ��� �ƽ�Ű ��ȣ�� 'A'�� 65��, ��B'�� 66��, ��C'�� 67�� �� ���ʴ�� 1�� �����Ͽ� ��Z'�� 90���Դϴ�.

������ 4���� ���ڸ� ������ ���� ��ȣ�� ���´ٸ�

#****###**#####**#####**##**

�� ��ȣ�� 4���� ���ڽ�ȣ�� �����ϸ�

#****## --> 'C'

#**#### --> 'O'

#**#### --> 'O'

#**##** --> 'L'

���������� ��COOL"�� �ؼ��˴ϴ�.

������ ���� ��ȣ�� �ؼ����ִ� ���α׷��� �ۼ��ؼ� ���� �����ּ���.


�Է�
ù �ٿ��� ���� ������ ����(10�� ���� �Ƚ��ϴ�)�� �Էµȴ�. ���� �ٿ��� ������ ������ �ϰ� �� ��ŭ�� #�Ǵ� * ��ȣ�� �Էµ˴ϴ�.

������ �׻� �빮�ڷ� �ؼ��� �� �ִ� ��ȣ�� �����ٰ� �����մϴ�.


���


*/