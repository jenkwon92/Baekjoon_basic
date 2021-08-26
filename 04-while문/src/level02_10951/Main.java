package level02_10951;

import java.util.Scanner;
//갯수가 정해지지 않은 while문 
//언제 끝낼지모르기 때문에 입력값이 있을경우만 출력
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(A + B);

		}

	}
}
