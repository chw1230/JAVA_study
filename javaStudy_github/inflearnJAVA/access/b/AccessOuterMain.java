package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        // dafault 호출 불가
        // data.defaultField = 2;
        // data.defaultMethod();

        // private 호출 불가
        // data. privateFeild = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}
