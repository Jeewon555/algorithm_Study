//배수와 약수 - 5086(Bronze3)
import java.util.Scanner;

public class baekjoon5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트 갯수가 주어지지 않아서 for문으로 할 수가 없음
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 & b == 0) break;

            if (b % a == 0) {
                System.out.println("factor");
            } else if(a % b == 0){
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

        sc.close();
    }
}
