package level08_11022;

import java.util.Scanner;

public class Main {
	/*
	 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		�� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.
		Case #1: 1 + 1 = 2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int index = 1;
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #"+index+": "+A+ " + " +B +" = "+ (A+B));
			
			index++;
		}
		
		if(sc != null)
			sc.close();
	}
}
