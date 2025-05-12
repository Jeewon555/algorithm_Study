//객체지향 - 1920(Silver4)
import java.util.*;

public class baekjoon1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            //이진 탐색 전 정렬 필수
            Arrays.sort(A);
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int target = sc.nextInt();
            System.out.println(binarySearch(A, target));
        }

        int target = sc.nextInt();
        System.out.println(binarySearch(A, target));

        sc.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return 1;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return 0;
    }


}
