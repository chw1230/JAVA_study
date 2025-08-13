package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj){
        System.out.println("Object print = " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){ // 메서드안에서만 사용되는 제네릭!
        System.out.println("Object print = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){ // 메서드안에서만 사용되는 제네릭! 여기서도 제한을 할 수 있음!
        System.out.println("bound print = " + t);
        return t;
    }

}
