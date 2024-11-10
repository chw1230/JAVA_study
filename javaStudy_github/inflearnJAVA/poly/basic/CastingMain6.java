package poly.basic;

//
public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof Child child){ // 설명을 하면 parent의 인스턴스가 Child라면
            // 위에 코드에서 참이라면 child라는 변수까지 생성해준다. 자바 16에서 나오는 내용
            System.out.println("Child 인스턴스 맞음");
            child.childMethod(); // 가능함!!
        }
    }
}
