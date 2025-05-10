//전투 드로이드 가격 - 5361(Bronze3)
import java.util.Scanner;
//추상클래스(인식X)
abstract class price{
    public abstract double A(int a);
    public abstract double B(int a);
    public abstract double C(int a);
    public abstract double D(int a);
    public abstract double E(int a);
}
//상속받음
public class baekjoon5361 extends price{
    public double A(int a){ return 350.34*a;}
    public double B(int a){ return 230.90*a;}
    public double C(int a){ return 190.55*a;}
    public double D(int a){ return 125.30*a;}
    public double E(int a){ return 180.90*a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        baekjoon5361 s = new baekjoon5361();

        for (int i = 0; i < n; i++) {
            //각각 입력을 받음
            int a = sc.nextInt(); // 항공기 엔진 수
            int b = sc.nextInt(); // 외장재 수
            int c = sc.nextInt(); // 연료 수
            int d = sc.nextInt(); // 레이저 수
            int e = sc.nextInt(); // 에너지 실드 수

            //total 출력(소수점 둘째자리까지)
            double total = s.A(a)+s.B(b)+s.C(c)+s.D(d)+s.E(e);
            System.out.printf("$%.2f\n",total);
        }

        sc.close();
    }
}


//import java.util.Scanner;
//
//public class baekjoon5361 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int T = sc.nextInt(); // 테스트 케이스 개수
//
//        for (int i = 0; i < T; i++) {
//            int a = sc.nextInt(); // 항공기 엔진 개수
//            int b = sc.nextInt(); // 탄소 합금 외장재 개수
//            int c = sc.nextInt(); // 추진 연료 개수
//            int d = sc.nextInt(); // 레이저 캐논 개수
//            int e = sc.nextInt(); // 에너지 실드 개수
//
//            double total = a * 350.34 + b * 230.90 + c * 190.55 + d * 125.30 + e * 180.90;
//
//            System.out.printf("$%.2f\n", total); // 달러 부호와 소수점 2자리
//        }
//
//        sc.close();
//    }
//}