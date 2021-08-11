package level11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));//3
		System.out.println((A*((B%100)-(B%10)))/10);//4
		System.out.println((A*((B%1000)-(B%100)))/100);//5
		System.out.println(A*(B%1000));//6
	}
}
