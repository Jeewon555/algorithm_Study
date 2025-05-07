//알파벳찾기 - 10809(Bronze2)
import java.util.Scanner;

public class baekjoon10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //String 타입을 배열로 접근하려면 --> s.charAt(i)로 !!

        for (char ch = 'a'; ch < 'z'; ch++) {
            System.out.print(s.indexOf(ch) + " ");
        }

//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                //s.charAt(i)로 !!(String이라)
//                if (s.charAt(i) == 'a') {
//                    System.out.print(i );
//                } else {
//                    System.out.print("-1 ");
//                }
//            }
//        }

        sc.close();
    }
}
