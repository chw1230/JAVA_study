package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        //AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>(); // T의 제한 범위에 포함되지 않아서 들어갈 수 가 없다!

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup(); // 이름, 크기, 소리 확인

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup(); // 이름, 크기, 소리 확인

        // 문제 1 : 개 병원에 고양이 전달
        //dogHospital.set(cat); // 다른 타입을 입력하게 되어 오류가 발생한다!
        //  dogHospital을 만드는 과정에서 T가 Dog가 되었기 때문에 cat이 들어갈 수 가 없다!


        // 문제 2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
