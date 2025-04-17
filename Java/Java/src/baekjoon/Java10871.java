//1차원배열Level2(Bronze5) - 10871번 (구현)
package baekjoon;

import java.util.Scanner;

public class Java10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int A[] = new int[N];                      //수열입력 받아야함
		for (int i= 0; i < N; i++) {               //A의 갯수 N개만큼 입력받음
            A[i]= sc.nextInt();
        }
		
		for(int i=0;i<N;i++) {              
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}		
		}	
		
		sc.close();
	}

}
