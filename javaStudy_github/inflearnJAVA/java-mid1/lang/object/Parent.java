package lang.object;

// 부모가 없으면 묵지적으로(자동으로) Object 클래스를 상속받는다.
public class Parent { // 최상위 부모는 항상 Object라고 생각하면 된다.
    // 그래서 Parent 뒤에 extends Object를 적지 않아도 자동으로 자바가 넣어줌
    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
