//반복문 Level3 - Bronze5(8393번)
package algorithm_Study;

import java.util.Scanner;

public class Java8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;       
        }
        System.out.println(sum);
	}

}
