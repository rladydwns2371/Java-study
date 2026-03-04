package com.wanted.polymorphism.b_interface;

public interface interfaceProduct {
        /*comment.
        *  인터페이스는 구현부(메소드의 중괄호부분)가 있는 메소드를 작성할 수 없다.
        *   또한 생성자 역시 가질 수 없다.*/

    //인터페이스는 생성자를 못 쓴다
//    public InterfaceProduct(){}

    //인터페이스는 구현부가 있는 메소드를 못쓴다.
//    public void test(){}

    void mehodA();

    static void staticMethod(){
      //static 메소드는 구현부 작성이 가능하다.
    };
}
