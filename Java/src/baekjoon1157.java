//단어 공부 - 1157(Bronze1)
import java.util.Scanner;

public class baekjoon1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //한 단어 입력을 받아 "모두 대문자로 변환"
        String str = sc.next().toUpperCase();
        int[] count = new int[26];    // A~Z 저장(26개)

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);   // charAt(i): i번째 문자 추출
            count[c - 'A']++;
        }

        int max = -1;  // count[0]부터 시작하니까 max=-1로 함(안전하게)
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);

        sc.close();
    }
}
