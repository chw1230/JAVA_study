package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> IntegerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> ObjectHospital = new AnimalHospitalV2<>();
        // 이렇게 animal과 아무런 상관없는 티입들도 들어오게 된다!
    }
}
