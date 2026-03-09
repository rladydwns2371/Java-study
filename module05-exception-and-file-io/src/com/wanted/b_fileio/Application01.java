package com.wanted.b_fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) throws FileNotFoundException {
        /*comment. 파일 입력과 출력
        *  파일 입출력은은 프로그램에서 데이터를 파일에 저장하거나, 읽어오는 기능을 의미한다.
        *   이는 데이터를 우리가 영구적으로 보존하거나, 외부의 데이터를 활용할 때 필수적이다.
        *   파일작업은 외부 자원에 의존을 한다.
        *   파일이 없거나, 권한 부족하거나, 이름이 잘못되거나 기타 등등의 예외상황에서
        *   자주 발생한다.
        * */

        // 기본 파일 작성해보기
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, Wanted!!");
            writer.write("File Test....");

            // flush() 버퍼에 있는 데이터를 밀어서 버퍼를 비우고 즉시 디스크에 기록한다.
            writer.flush();
            System.out.println("파일쓰기 완료!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //파일 읽어오기
        try {
            FileReader reader = new FileReader("output.txt");

            int data;
            //파일 끝까지 읽는 방법(파일 끝은 -1로 정의됨.)
            //.read(): 파일에서 한 문자씩을 읽고, 파일 끝에 도달하면 -1을 반환한다.
            while((data = reader.read())!=-1){
                System.out.print((char)data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
