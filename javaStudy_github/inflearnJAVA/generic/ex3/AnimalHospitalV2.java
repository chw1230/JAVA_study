package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        // T의 타입은 메서드를 정의하는 시점에서는 알 수가 없다! 정의하는 과정에서는 Object 기능만 사용가능하다. ex> toSting(), equals() 이런 것 들!
        // animal의 타입을 모르니 animal.getName() 이런 것들이 오류가 나게 된다.
        /*
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
         */
    }

    public T bigger(T target) {
        /*
        return animal.getSize() > target.getSize() ? animal : target;
       */
        return null;
    }
}
