package com.wanted.oop.d_constructor;

import java.time.LocalDate;

public class UserDTO {

    private String id;
    private String pw;
    private String name;
    private LocalDate enrollDate;

    /*comment.
    *   생성자의 사용 목적
    *   1. 객체 생성 시점에 수행 할 명령이 있는 경우에 사용한다.
    *   2. 매개변수가 있는 생성자의 경우 매개변수로 전달받은 값으로
    *   기본값이 아닌 필드를 초기화하면서 객체를 생성할 목적으로 사용한다.
    *   3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다.*/

    /*comment. 생성자 표현식
    *   접근 제한자 클래스명([매개변수]){
    *       객체 생성 시점에 수행 할 코드
    *       this.필드명 = 매개변수
    *   }*/

    //기본 생성자 -> 우리가 작성하지 않아도 컴파일러가 알아서 추가해줌
    public UserDTO() {
        System.out.println("UserDTO의 기본 생성자 호출됨");
    }

    /*comment. 주의!!
    *   만약 클래스 내부에 매개변수가 있는 생성자를 작성했다면,
    *   기본 생성자는 자동으로 생성되지 않는다.
    *   따라서 이 점을 주의하자.*/


    //매개변수가 있는 생성자
    public UserDTO(String id, String pw, String name, LocalDate enrollDate) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }

}
