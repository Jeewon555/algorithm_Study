//1차원배열 Level1(Bronze5) - 10807번 
package baekjoon;

import java.util.Scanner;

public class Java10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int v[] = new int[N];
		
		for(int i=0;i<v.length;i++) {          
			v[i] = sc.nextInt();
		}		
		
        int sum = 0;	
        int target = sc.nextInt();
        
		for(int i=0;i<v.length;i++) {
						
			if(target == v[i]) {
				sum += 1;
			}
		}		
		System.out.println(sum);
		
		sc.close();
	}

}
