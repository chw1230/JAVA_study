package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();


        //존재하지 않는 등급일때
        int vip = discountService.discount("VIP", price);
        System.out.println("vip = " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액: " + gold);

        // grade에 어떤 문자열이든 넣으면 코드가 실행되는 단점이 존재함 그래서 grade에 존재하지 않는 vip,
        // diamondd 와 같은 것도 오류를 내지않고 동작함
    }
}
