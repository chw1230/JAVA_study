package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup(); // 이름, 크기, 소리 확인

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup(); // 이름, 크기, 소리 확인

        // 문제 1 : 개 병원에 고양이 전달
        dogHospital.set(cat); // 매개변수 체크 실패 / cat이든 dog든 다 받아 드릴 수 있음!

        // 문제 2 : 개 타입 반환
        dogHospital.set(dog);
        //dogHospital.set(cat);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200)); // Animal 타입을 반환하기 때문에 다운 캐스팅을 해야한다.
        System.out.println("biggerDog = " + biggerDog);
        // 비교 과정에서  dogHospital.set(cat) 을 했을 때 고양이와 멍멍이2 중 고양이가 더 큰 경우라면
        // dogHospital.bigger(new Dog("멍멍이2", 200))에 대한 결과가 cat이 나오게 된다! 하지만 이 cat을 (Dog)로 다운 캐스팅 할 수 없기 때문에 오류가 발생하게 된다!!
    }
}
