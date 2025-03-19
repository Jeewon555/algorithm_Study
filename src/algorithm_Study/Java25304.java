//조건문 Level4 - Bronze4(25304번)
package algorithm_Study;

import java.util.Scanner;

public class Java25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();       
        int total = 0;
        
        for(int i=0;i<N;i++){
            int price = sc.nextInt(); //물건 가격
            int count = sc.nextInt(); //물건 개수
            total += price*count; //가격*개수 누적합
        }
        
        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        sc.close();
	}

}
