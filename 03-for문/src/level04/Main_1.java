package level04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		InputStreamReader ir = new InputStreamReader(System.in);
		OutputStreamWriter ow = new OutputStreamWriter(System.out);
		
		BufferedReader br = new BufferedReader(ir);
		BufferedWriter bw = new BufferedWriter(ow);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); //readLineπ›»ØÅ£ String
		
		StringTokenizer  st = null;
		
		
		try {
			for(int i=0; i<T; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
			}
		}finally {
			bw.close();
		}
	}
}
