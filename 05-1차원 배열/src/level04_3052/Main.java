package level04_3052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
		//�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer>set = new HashSet<Integer>();
		
	
		for(int i=0; i<10; i++) {
			set.add(scanner.nextInt()%42);
		}
		scanner.close();
		System.out.println(set.size());	
		
	}
}
