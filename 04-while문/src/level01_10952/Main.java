package level01_10952;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		// �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		// �Է��� ���������� 0 �� ���� ���´�.

		Scanner sc = new Scanner(System.in);

		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A == 0 && B == 0)
				break;

			System.out.println(A + B);
		}
	}
}
