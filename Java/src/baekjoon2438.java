//별 찍기1 - 2438(Bronze5)
import java.util.Scanner;

public class baekjoon2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //i = 현재줄, j = 별의 개수
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        sc.close();
    }
}
