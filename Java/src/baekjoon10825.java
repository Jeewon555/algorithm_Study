//국영수 - 10825(Silver4)
import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon10825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력
        int N = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.add(str);
        }

        //출력
        //*a는 감소 순서+a가 같으면 b가 증가 순서
        // +a=b c가 감소+ 다같으면? 이름 사전순

  
  
        sc.close();
    }
}
