package level03_8393;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum =0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
			
	}
}
