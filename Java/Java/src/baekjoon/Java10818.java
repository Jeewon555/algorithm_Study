//1차원배열 Level3(Bronze3) - 10818번 (구현, 수학)
package baekjoon;

import java.util.Scanner;

public class Java10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		
		//입력받기 
		int arr[] = new int[N];                 //입력값을 저장할 배열 생성 		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		//처음값으로 초기화 
		int min = arr[0];                       
		int max = arr[0];
		
		for(int i=0;i<N;i++) {
			if(arr[i] <= min) {
				min = arr[i];		
			}
			if(arr[i] >= max) {
				max = arr[i];
			}
		}
		
		System.out.print(min + " " + max);
		
		sc.close();
	}
}
