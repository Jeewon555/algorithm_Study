//X보다 작은수 - 10871(Bronze5)
import java.util.Scanner;

public class baekjoon10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int A[] = new int[N];       //배열 선언 !!!

        for (int i = 0; i < N; i++) {
            //둘째 줄에 입력 받기
            //A[i]에 입력받는 것이니까 따로 s같은 것 선언X
            A[i] = sc.nextInt();
            if (A[i] < X){
                System.out.print(A[i] + " ");
            }
        }

        sc.close();
    }
}
