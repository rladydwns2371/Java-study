package com.wanted.object.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        /*comment. 배열을 활용한 Java 시험점수 계산기*/
        /*요구사항.
         * 1. 5명의 Java 점수를 입력받는다.
         * 2. 점수를 입력 받아서 합계와 평균을 실수로 구하는 프로그램*/

        // 5명의 Java 점수를 저장할 배열 생성
        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double mean;

        //합계란? 모든 배열의 인덱스 공간에 위치한 값을 sum 변수에 누적해서 더함.
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 째 학생의 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        mean = sum / scores.length;

        System.out.println("sum = "+sum);
        System.out.println("mean = "+mean);
    }
}