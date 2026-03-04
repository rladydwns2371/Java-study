package com.wanted.object.a_string;

public class Application01 {
    public static void main(String[] args) {
        /*comment.
        *  자료형은 크게 2가지 종류.
        * 1. 기본자료형(ex: int, double, boolean 등)
        * 2. 참조자료형(ex: String)
        * 3. 사용자 정의의 자료형 */

        /*comment. Sting  에서 사용되는 메소드*/
        String str1 = "apple";

        //lengh() : 길이
        //charAt(index) : 문자열을 문자로 변환
        System.out.println(str1.length());
        for(int i = 0; i<str1.length();i++){
            System.out.println("charAt("+i+")="+str1.charAt(i));
        }

        String timeStr = "   java   ";
        System.out.println("공백 자르기 전 확인 : "+timeStr+"#"); //공백 확인용
        System.out.println("공백 자른 후 확인 : "+timeStr.trim()+"#"); //공백 확인용
    }
}
