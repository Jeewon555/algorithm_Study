//백준11022 - 반복문Level8 (Bronze5/구현)
package baekJoon;

import java.util.Scanner;

public class Java11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
            int A = sc.nextInt();
		    int B = sc.nextInt();
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}		
		sc.close();

	}

}
