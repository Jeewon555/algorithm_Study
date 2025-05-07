//KMP는 왜 KMP일까? - 2902(Bronze2)
import java.util.Scanner;

public class baekjoon2902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        //'-' 기준으로 분할
        String []parts = s.split("-");

        for (int i = 0; i < parts.length; i++) {
            System.out.print(parts[i].charAt(0));
        }
        //charAt(0): 단어의 첫글자

        sc.close();
    }
}
