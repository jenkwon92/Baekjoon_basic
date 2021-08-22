package level01_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2 {
	/*
	 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ù° �ٿ� ������ ���� N (1 �� N ��
	 * 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����,
	 * 1,000,000���� �۰ų� ���� �����̴�. ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
	 */

	/*
	 * ��Ŭ���� ȣ���� Euclidean algorithm
	 * 
	 * ��Ŭ���� ȣ���� �Ǵ� ��Ŭ���� �˰����� 2���� �ڿ��� �Ǵ� ������ �ִ������� ���ϴ� �˰����� �ϳ�. ȣ�����̶� �� ���� ���� ����
	 * ���� ����� �ᱹ ���ϴ� ���� ��� �˰����� ��Ÿ��.
	 * 
	 * 
	 * 2���� �ڿ����� �޾� �ִ������� �ޱ� ���� 2���� �� �ڿ��� �� ���� �ڿ������� ��� ������鼭 ���� ū ������� ���� �� �ִ�. ����
	 * ���� ������� ������ Ǯ�� �ð����⵵�� O(N)�� �ȴ�. ���� ����� �ƴ����� ȿ���� ���̱� ���� ��Ŭ���� ȣ�����̶� �˰����� ����ϸ�
	 * �ð����⵵�� O(logN)���� ���� �� �ִ�.
	 * 
	 * 2���� �ڿ��� a, b�� ���ؼ� a�� b�� ���� �������� r�̶� �ϸ� (�� a>b), a�� b�� �ִ������� b�� r�� �ִ������� ����
	 * ������ ����, b�� r�� ���� ������ r0�� ���ϰ�, �ٽ� r�� r0�� ���� �������� ���ϴ� ������ �ݺ��Ͽ� �������� 0�� �Ǿ��� ��
	 * ������ ���� a�� b�� �ִ������̴�
	 * 
	 * GCD(A,B) = GCD(B,A %B) if A%B = 0 -> GCD =B else GCD(B,A%B)
	 * 
	 * 1. �Է����� �� �� m,n(m>n)�� ���´�. 2. n�� 0�̶��, m�� ����ϰ� �˰����� �����Ѵ�. 3. m�� n���� ������
	 * ��������, n�� ����ϰ� �˰����� �����Ѵ�. 4. �׷��� ������, m�� n���� ���� �������� ���Ӱ� m�� �����ϰ�, m�� n�� �ٲٰ�
	 * 3������ ���ƿ´�.
	 * 
	 * public static int gcd(int p, int q) { if (q == 0) return p; return gcd(q,
	 * p%q); }
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = br.read(); //readLine�� read�� ������?
		int N = Integer.parseInt(br.readLine()); //readLine�� read�� ������?
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int [] array = new int[N];
		
		for(int i=0; i<N; i++)
			array[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(array);
		
		System.out.println(array[0] + " "+ array[N-1]);
		
		br.close();
	}
}
