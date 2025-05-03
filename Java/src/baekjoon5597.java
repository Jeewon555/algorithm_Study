//과제 안 내신분..? - 5597(Bronze3)
import java.util.Scanner;

public class baekjoon5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] submitted = new int[28];

        for (int i = 0; i < submitted.length; i++) {
            submitted[i] = sc.nextInt();
        }

        for (int i = 1; i <= 30; i++) {
            boolean found = false;

            for (int j = 0; j < 28; j++) {
                if (submitted[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
