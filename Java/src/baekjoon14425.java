// 문자열 집합 - 14425(Silver4)
import java.util.*;

public class baekjoon14425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();                  // 줄바꿈 지우기

        HashMap<String, Boolean> map = new HashMap<>();
        // 집합 S 입력
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            map.put(s, true);      //존재 표시
        }

        int count = 0;
        // 검사할 문자열 입력
        for (int i = 0; i < M; i++) {
            String k = sc.nextLine();
            //map.containsKey(key): HashMap 안에 키 존재여부 확인  --> true/false로 리턴함
            //key만 확인함!! 값(value)은 확인하지 않음
            if (map.containsKey(k)) {
                count++;
            }
        }

        System.out.print(count);
        sc.close();
    }
}

//ex)
// 예시 입력:
// 3
// hello

// int n = sc.nextInt();         -->  출력: 3
// String s = sc.nextLine();     -->  출력: ??(빈 문자열)

// 이유: 3 + '\n'입력해서 String s 에는 '\n', 즉 빈 문자열("")이 리턴됨.
// 방법: '\n'을 없애주는(개행 문자 제거) nextLine();를 한 번 더 호출해서 버퍼를 지워줘야 함!!!

// int n = sc.nextInt();
// sc.nextLine();                -->  남아 있는 개행 제거
// String s = sc.nextLine();     -->  이제 제대로 문자열 한 줄 입력 가능