package level02_10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
	
		
		//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		
		
			for(int i=0; i<T; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				System.out.println(A+B);
			}
		if(sc!=null)
		sc.close();
	}
}
