//상수 - 2908(Bronze2)
import java.util.Scanner;
public class baekjoon2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        //문자열 뒤집기
        //StringBuilder(): 문자열을 수정할 수 있게 해주는 '가변 문자열 클래스'
        //reverse(): 문자열을 뒤집음
        String reversedA = new StringBuilder(a).reverse().toString();
        String reversedB = new StringBuilder(b).reverse().toString();

        //정수로 변환
        //Integer.parseInt(): 문자열(String)->정수(Int)로 변환
        int numA = Integer.parseInt(reversedA);
        int numB = Integer.parseInt(reversedB);

        //더 큰 수 출력
        System.out.print(Math.max(numA, numB));

        sc.close();
    }
}
