package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { // T에 들어 올 수 있는 것을 제한한다!!!! !Animal과 그 자식으로 제한!

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
        // T에 들어 갈 수 있는 것을 Animal이나 Animal의 자식으로 제한 하였기 때문에 기존의 오류였던것이 오류가 아니게 바뀜!!!!!!
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
        // T에 들어 갈 수 있는 것을 Animal이나 Animal의 자식으로 제한 하였기 때문에 기존의 오류였던것이 오류가 아니게 바뀜!!!!!!

    }
}
