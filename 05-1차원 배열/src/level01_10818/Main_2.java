package level01_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2 {
	/*
	 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오. 첫째 줄에 정수의 개수 N (1 ≤ N ≤
	 * 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고,
	 * 1,000,000보다 작거나 같은 정수이다. 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
	 */

	/*
	 * 유클리드 호제법 Euclidean algorithm
	 * 
	 * 유클리드 호제법 또는 유클리드 알고리즘은 2개의 자연수 또는 정식의 최대공약수를 구하는 알고리즘의 하나. 호제법이란 두 수가 서로 상대방
	 * 수를 나누어서 결국 원하는 수를 얻는 알고리즘을 나타냄.
	 * 
	 * 
	 * 2개의 자연수를 받아 최대공약수를 받기 위해 2부터 두 자연수 중 작은 자연수까지 모두 나누어보면서 가장 큰 공약수를 구할 수 있다. 위와
	 * 같은 방법으로 문제를 풀면 시간복잡도는 O(N)이 된다. 나쁜 방법은 아니지만 효율을 높이기 위해 유클리드 호제법이란 알고리즘을 사용하면
	 * 시간복잡도를 O(logN)으로 줄일 수 있다.
	 * 
	 * 2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면 (단 a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다
	 * 성질에 따라, b를 r로 나눈 나머지 r0를 구하고, 다시 r을 r0로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때
	 * 나누는 수가 a와 b의 최대공약수이다
	 * 
	 * GCD(A,B) = GCD(B,A %B) if A%B = 0 -> GCD =B else GCD(B,A%B)
	 * 
	 * 1. 입력으로 두 수 m,n(m>n)이 들어온다. 2. n이 0이라면, m을 출력하고 알고리즘을 종료한다. 3. m이 n으로 나누어
	 * 떨어지면, n을 출력하고 알고리즘을 종료한다. 4. 그렇지 않으면, m을 n으로 나눈 나머지를 새롭게 m에 대입하고, m과 n을 바꾸고
	 * 3번으로 돌아온다.
	 * 
	 * public static int gcd(int p, int q) { if (q == 0) return p; return gcd(q,
	 * p%q); }
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int N = br.read(); //readLine과 read의 차이점?
		int N = Integer.parseInt(br.readLine()); //readLine과 read의 차이점?
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int [] array = new int[N];
		
		for(int i=0; i<N; i++)
			array[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(array);
		
		System.out.println(array[0] + " "+ array[N-1]);
		
		br.close();
	}
}
