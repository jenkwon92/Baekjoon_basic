package level04_15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//일단 하는데 왜 이런건지는 모름...
class Main1{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        
        for(int i = 0; i<T;i++){
            st = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        br.close();
        
        bw.flush();
        bw.close();
    }
}