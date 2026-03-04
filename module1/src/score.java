import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요 : ");
        int korean  = sc.nextInt();
        System.out.println("영어 점수를 입력하세요 : ");
        int english = sc.nextInt();
        System.out.println("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();

        int sum  = korean + english + math;
        int mean = sum/3;
        boolean s =  (korean>=40&&english>=40&&math>=40&&sum>=40);
        boolean m = mean>=60;


        if (s&&m){
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + mean);
            System.out.println("합격");
        }else{
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + mean);
            System.out.println("불합격");
        }

    }
}
