package level03_2577;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//A ¡¿ B ¡¿ C = 150 ¡¿ 266 ¡¿ 427 = 17037300
		
		int multiple =sc.nextInt()*sc.nextInt()*sc.nextInt();
		sc.close();
		String str = Integer.toString(multiple);
		
		for(int i=0 ; i<10; i++) {
			int count =0;
			for(int a=0; a<str.length();a++) {
				if((str.charAt(a)-'0')==i)
					count++;
			}
			System.out.println(count);
		}
	}
}
