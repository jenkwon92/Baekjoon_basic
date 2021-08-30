package level02_2562;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int[] list=new int[9] ;
		int max = list[0]; //min°ª ¼³Á¤
		int index = 0;
		for(int i=0; i<9; i++) {
			list[i]  =sc.nextInt();
			if(list[i]>max) {
				max = list[i];
				index = i;
			}
		}
		//3 29 38 12 57 74 40 85 61
		//85
		//8

		System.out.println(max);
		System.out.println(index+1);
	}
}
