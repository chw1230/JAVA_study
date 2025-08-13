package generic.ex3;

import generic.animal.Cat;

public class CatHospital {

    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }
    
    public void checkup(){ // 개의 이름과 크기를 출력
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target) { // 다른 개와 크기를 비교, 둘 중 큰 개를 반환
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
