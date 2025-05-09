//단어정렬 - 1181(Silver5)
import java.util.*;

public class baekjoon1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력
        int N = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();

            //중복 제거(list.contains(str): 리스트 안에 str이 이미 존재하는지 확인)
            if (!list.contains(str)) {
                list.add(str);                 //새로운 단어면 추가
            }
        }


        //출력
        //*길이가 짧고+같으면 사전순+중복 제거*

        // 정렬: 길이 오름차순 → 길이 같으면 사전 순
        list.sort((a, b) -> {
            if (a.length() != b.length()) return a.length() - b.length();
            return a.compareTo(b);
        });
        //출력(list안에 있는 모든 word를 꺼내서 출력)
        for (String word : list){
            System.out.println(word);
        }

        sc.close();
    }
}
