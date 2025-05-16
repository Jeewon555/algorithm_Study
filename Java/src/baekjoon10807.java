//개수 세기 - 10807(Bronze5)
import java.util.*;

public class baekjoon10807 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            v.add(sc.nextInt());        //입력값을 받아서 벡터에 추가하기!!!
        }

        int V = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (v.get(i) == V) {
                sum += 1;
            }
        }

        System.out.print(sum);
        sc.close();
    }
}
