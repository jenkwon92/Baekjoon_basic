package level11_10871;

import java.util.Scanner;

public class Main {
	//���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
	
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			int list = sc.nextInt();
			if(list<X) {
				sb.append(list+" ");
			}
		}
		System.out.println(sb);
	}
}
