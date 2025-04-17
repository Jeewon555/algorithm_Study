//정렬 Level1(Bronze2) - 2750번 (구현, 정렬)
package baekjoon;

import java.util.Scanner;

public class Java2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//입력받기 
		int arr[] = new int[N];             	       //입력값을 저장할 배열 생성
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		//버블정렬(sort 안쓰고 하는 방법)
		for (int i = 0; i < N-1; i++) {        //전체 정렬을 위해 N-1번 반복(배열 전체를 순차적으로 정렬)
			//아직 정렬되지 않은 구간만 비교(비교가 끝난 i만큼 빼주기)
			for (int j = 0; j < N-1-i; j++) {   
				if(arr[j] > arr[j+1]) {
					//swap(임시변수 temp를 이용)
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//바깥쪽 반복문: N-1??--> 가장 작은 수가 왼쪽 끝으로 확정되기까지는 필요 없고, 각 회전에서 하나의 큰 수가 확정된다. 
		// --> 마지막 남은 두 수는 굳이 비교하지 않아도 이미 정렬되어 있다. 
		
		
		//출력
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
