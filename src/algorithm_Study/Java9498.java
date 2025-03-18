//조건문 Level2 - Bronze5(9498번)
package algorithm_Study;

import java.util.Scanner;

public class Java9498 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //System.in 으로 받기
		int score = sc.nextInt();	
		sc.close();
		
		if(90 <= score && score <= 100) { //나눠서 &&으로 연결
			System.out.println("A");
		}else if(80 <= score && score < 90) {
			System.out.println("B");
		}else if(70 <= score && score < 80) {
			System.out.println("C");
		}else if(60 <= score && score < 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
