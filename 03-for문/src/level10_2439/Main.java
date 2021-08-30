package level10_2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 
		 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		 			                    *
		 				              **
		 						    ***
		 						  ****
		 						*****
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			for(int a=1; a<=N-i; a++) {
				System.out.print(" ");
			}
			for(int b=1; b<=i; b++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}
}












