package level05_2741;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
		
		if(scanner !=null) {
			scanner.close();
		}
	}
}
