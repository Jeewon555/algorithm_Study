//조건문 Level2 - Bronze5(10950번)
package algorithm_Study;

import java.util.Scanner;

public class Java10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //T에 정수를 대입해야하니까 
        
        for(int i=0;i<T;i++){
            int A = sc.nextInt(); //A,B가 반복 출력이니까 for문안에 쓰기
            int B = sc.nextInt();
            System.out.println(A+B);
        }
        
        sc.close();  
	}

}
