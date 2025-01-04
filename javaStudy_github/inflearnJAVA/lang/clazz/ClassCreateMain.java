package lang.clazz;


public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        //Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");
        // -> 이 방식을 사용하면 사용자의 입력을 받아서 받은 값을 " " 속에 집어 넣어서 동적으로 객체를 생성할 수 있다.

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}
