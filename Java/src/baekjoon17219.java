//비밀번호 찾기 - 17219(Silver4)
import java.util.*;

public class baekjoon17219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();              //개행 제거(중요함!!!)  --> 안 쓰면'\n'이 남아있기에 첫 번째는 빈 문자열("")로 인식됨

        HashMap<String, String> dic = new HashMap<>();

        //N개의 사이트 주소와 비밀번호 저장
        for (int i = 0; i < N; i++) {
            String str1 = sc.nextLine();             //ex) google abc123
            String[] part = str1.split(" ");   //공백 기준 분리 -> ["google", "abc123"]
            dic.put(part[0], part[1]);               //map에 저장: dic["google"(키)] = "abc123"(값)
        }

        //M개의 사이트 주소와 비밀번호 저장
        for (int i = 0; i < M; i++) {
            String str2 = sc.nextLine();
            System.out.println(dic.get(str2));
        }

        sc.close();
    }
}
