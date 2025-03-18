//반복문 Level5 - Bronze5(2739번)
package algorithm_Study;

import java.util.Scanner;

public class Java2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for(int i=1;i<10;i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }
	}

}
