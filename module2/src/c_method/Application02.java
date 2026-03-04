package c_method;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application02 {
    /*comment. 메소드란?
     *   메소드는 어떤 특정 작업을 수행하기 위한
     *   명령문의 집합이다.
     *   public: 접근 제어자
     *   void: 반환 타입*/

    public static void main(String[] args) {

        // 1. 메인 메소드가 가장 먼저 동작함
        System.out.println("main() 시작됨...");

        // 2. 메인 메소드 밖에 methodA를 추가해보자

        // 5. methodA를 호출하는 구문
        //comment.
        // 클래스명 변수명 = new 클래스명();
        Application02 app2 = new Application02();
        app2.methodA();

        //6. main 메소드 최하단부 종료코드
        System.out.println("프로그램 종료됨...");
    }

    // 3. 메인 메소드에서 호출이 되는 지를 확인
    public void methodA(){

        //4. 호출 확인을 위한 출력 구문
        System.out.println("methodA() 호출됨...");

        //11. methodA() 내부에서 methodB를 호출해보자.

        //12. methodB() 호출구문작성
        methodB(); // main에서 부르는 방식이 다르네

        //13. methodA() 종료되는 시점 확인을 위한 출력문 작성
        System.out.println("methodA() 종료됨...");
    }

    // 8. 호출 확인을 위한 methodB 작성
    public void methodB(){

        //9. methodA와 같은 방식으로 호출 확인을 위한 출력 구문
        System.out.println("methodB() 호출됨...");
    }
}


