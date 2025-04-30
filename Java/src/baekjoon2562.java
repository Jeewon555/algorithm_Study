//1차원배열Level4 - 2562(Bronze3)
import java.util.Scanner;

public class baekjoon2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //최댓값 저장
        int max = 0;
        int index = 0;

        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);

        sc.close();
    }
}
