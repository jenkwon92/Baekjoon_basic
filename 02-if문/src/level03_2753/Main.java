package level03_2753;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� ��  �Ǵ� 400�� ����� ���̴�. 
		 * ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
		 * 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
		 * ������, 2000���� 400�� ����̱� ������ �����̴�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if((A%4)==0 && (A%100)!=0 || (A%400)==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
