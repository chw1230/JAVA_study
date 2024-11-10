package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1;// 상속 관계 이거나 같은 패키지에 위치하면 사용 가능
        // defaultValue = 1; 다른 패키지라서 접근 불가 -> 컴파일 오류
        // privateValue = 1; 접근 불가

        publicMethod();
        protectedMethod();
        //defaultMethod();
        //privateMethod();
        printParent();
    }
}
