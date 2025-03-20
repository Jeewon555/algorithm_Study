//조건문 Level6 - Bronze4(15552번)
//->시간초과 (Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter 사용) 
package algorithm_Study;

import java.io.*;

public class Java152 {
	public static voi55d main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());  // 입력 개수
       
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int sum = a + b;
            bw.write(sum + "\n");  // 결과를 버퍼에 저장
        }

        bw.flush();  // 한 번에 출력
        br.close();
        bw.close();
    }
}

/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    
        int sum = 0;
        
        for(int i=0;i<N;i++){
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            sum = a+b;
            System.out.println(sum);
        }
        sc.close();
	}
}
*/