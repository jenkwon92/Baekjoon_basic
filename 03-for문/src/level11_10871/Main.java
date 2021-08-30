package level11_10871;

import java.util.Scanner;

public class Main {
	//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
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
