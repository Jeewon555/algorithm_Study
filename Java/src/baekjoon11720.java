//문자열Level5 - 11720(Bronze5)
import java.util.Scanner;

public class baekjoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        //숫자를 문자열로 입력받음(공백없이 한줄로 입력받는 경우에)
        String str = sc.next();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            //int M = sc.nextInt();
            //--> 이렇게하면 엔터로 구분해서 입력받을 때만 동작

            //문자를 숫자로 변환해서 더함
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
        sc.close();
    }
}
