//조건문 Level5 - Bronze3(2884번)
package algorithm_Study;

import java.util.Scanner;

public class Java2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        if(0 < H && H<= 23){ //'&&'으로 연결 
            if(M >= 45){
                System.out.println(H + " " + (M-45)); // '+'로 연결해주기
            }else{
                System.out.println(H-1 + " " + (M+15));
            }
        }else{ 
            if(M >= 45){
                System.out.println("0" + " " + (M-45));
            }else{
                System.out.println("23" + " " + (M+15));
            }
        }
        
	}
}

/*
 * 더 간단하게 풀이 
if (M >= 45) {
	System.out.println(H + " " + (M - 45));  
} else {
	if (H > 0) {  // H가 0이 아니면
    	System.out.println((H - 1) + " " + (M + 15));
	} else { // H가 0이면 23시로 변경
    	System.out.println("23 " + (M + 15));
	}
}
*/
