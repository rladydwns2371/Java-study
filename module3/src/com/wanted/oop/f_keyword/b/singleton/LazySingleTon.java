package com.wanted.oop.f_keyword.b.singleton;

public class LazySingleTon {

    //클래스가 초기화되는 시점에서 선언만 해두고
    //기본값은 null로 세팅을 해둔다.
    private static LazySingleTon lazy;

    //외부에서 객체를 생성할 수 없게 private6
    private LazySingleTon() {}


    //외부에서 객체 필요 시 호출하기 위한 메소드
    public static LazySingleTon getInstance() {
        /*인스턴스를 만든 적이 없으면 생성해서 반환
         *   생성한 적이 없다면 원래 만들어준 인스턴스 반환
         * */

        if (lazy == null) {
            lazy = new LazySingleTon();
        }
        return lazy;

    }
}
