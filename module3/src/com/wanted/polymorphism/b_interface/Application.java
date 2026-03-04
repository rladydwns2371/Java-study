package com.wanted.polymorphism.b_interface;

public class Application {
    public static void main(String[] args) {
//        interfaceProduct ip = new interfaceProduct() ;

        //다형성을 적용해서 실제 구현하고 있는 Product로 객체 생성
        interfaceProduct ip = new Product();
        ip.mehodA(); // 동적 바인딩


    }
}
