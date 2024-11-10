package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    // 추가
    MemberConstruct(String name,int age){
        this(name, age, 50);

    }

    // 생성자 --> 클래스 이름과 같아야 한다, 반환타입이 없음, 나머진 메서드와 같음
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name= "+name+",age="+age+",grade"+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
