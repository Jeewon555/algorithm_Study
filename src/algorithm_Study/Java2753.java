//조건문 Level3 - Bronze5(2753번)
package algorithm_Study;

import java.util.Scanner;

public class Java2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		sc.close();
		
		if(y % 4 == 0 && (y % 400 == 0 || y % 100 != 0)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
	}

}
