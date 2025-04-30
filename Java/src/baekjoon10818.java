//1차원배열Level3 - 10818(Bronze3)
import java.util.Scanner;

public class baekjoon10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //입력값을 저장할 배열 생성
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //처음값으로 초기화
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < N; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        System.out.print(min + " " + max);
        sc.close();
    }
}
