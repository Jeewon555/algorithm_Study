//1차원배열Level5 - 10810(Bronze3)
import java.util.Scanner;

public class baekjoon10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //바구니 개수
        int M = sc.nextInt();   //공을 넣는 개수

        //바구니 배열
        int basket[] = new int[N];

        //바구니를 배열로 만들고 초기값은 전부 0
        for (int s = 0; s < M; s++) {
            int i = sc.nextInt();  // 시작 번호
            int j = sc.nextInt();  // 끝 번호
            int k = sc.nextInt();  // 넣을 공 번호

            //M번 반복해서 i~j번 바구니에 k번 공을 넣음
            for (int x = i - 1; x <= j - 1; x++) {
                basket[x] = k;
            }
        }

        //모든 바구니 상태 출력(공 번호 순서대로)
        for (int x = 0; x < N; x++) {
            System.out.print(basket[x] + " ");
        }

        sc.close();
    }
}
