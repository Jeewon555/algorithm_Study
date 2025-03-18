//조건문 Level1 - Bronze5(1330번)
package algorithm_Study;

import java.util.Scanner;

public class Java1330 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt(); //숫자입력받기
		sc.close(); //sc닫기
	
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}
}
