//반복문 Level4 - Bronze4(구현, 사칙연산)
package baekjoon;

import java.util.Scanner;

public class Java25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();       
        int total = 0; 
        
        for(int i=0;i<N;i++){
            int price = sc.nextInt();
            int count = sc.nextInt();
            total += price*count;
        }
        
        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        sc.close();
	}
}
