package level09_2438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		for(int i=1; i<=N; i++) {
			for(int a=1; a<=i; a++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}
}
