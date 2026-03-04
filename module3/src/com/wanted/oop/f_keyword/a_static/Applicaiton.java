package com.wanted.oop.f_keyword.a_static;


public class Applicaiton {
    public static void main(String[] args) {
        /*comment. static 키워드에 대해 알아보자.*/


        // 객체 생성 구문
        StaticFieldTest st1 = new StaticFieldTest();

        System.out.println("non-static 변수 확인: " +st1.getNonStaticCount());
        System.out.println("static 변수 확인: "+st1.getStaticCount());

        //각 변수를 1씩 증가시키는 구문
        st1.increaseNonStatic();
        st1.increaseStatic();

        System.out.println("non-static 변수 확인: " +st1.getNonStaticCount());
        System.out.println("static 변수 확인: "+st1.getStaticCount());

        /*comment. 핵심 포인트
        *   새로운 StaticFieldTest 객체를 생성
        *   sout 구문을 실행했을 때, 0,0 이 나오는 것을 기대했지만,
        *   실제로 static 키워드가 붙은 변수는 1이 출력되었다.
        * */

        /*static 키워드를 붙이면 해당 메소드는 heap 메모리에서 개별적으로 관리하는것이 아닌
        * method area에서 함께 관리 즉 new로 새로운 객체를 만들어도 같은 메모리에서 관리가 되게 때문에
        * 값은 동일하며, 메모리 낭비를 줄일수 있다.
        * 하지만 new를 했을때 메모리가 지워지지 않기 때문에 오히려 높아질수도 (이부분은 다시 써칭해서 정리하자)*/



        StaticFieldTest st2 = new StaticFieldTest();
        System.out.println("non-static 변수 확인: "+st2.getNonStaticCount());
        System.out.println("static 변수 확인: "+st2.getStaticCount());

    }




}
