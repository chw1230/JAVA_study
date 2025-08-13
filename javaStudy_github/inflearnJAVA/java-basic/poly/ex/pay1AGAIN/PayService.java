package poly.ex.pay1AGAIN;

public class PayService {
// 4 - 처음에 이 클래스를 보고 새로운 결제가 추가된다 하여도 변화가 없게 하도록 코드를 수정하자라고 생각 -> 여기가 클라이언트를 담당하겠구나!
    public void processPay(String option, int amount) {
        // 33 - 코드 삭제 boolean result = false;// 19 - false로 초기화
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        // 27 - PayStore에 있는 메서드 이용하기
        Pay pay = PayStore.findPay(option);
        // 28 -> Pay경우 추가하기 kb,toss 추가 -> 추가 완료!
        // 29 밑의 코드 중에 null이 아닌 경우 작동되는 거를 클래스를 사용해서 널 오브젝트로 만들기!! -> 이름 defaultPay
        // Pay pay = findPay(option);// 21 함수 선언! -> 22 - 한가지 아쉬운 점 존재
        // -> 22 - 한가지 아쉬운 점 존재 -> findPay가 PayService에 있으면 새로운 Pay가 추가되면 코드를 수정해야하는데 클라이언트에서 수정을 하는 경우는 없어야함!
        // 24 -새로운 클래스를 만들어서 findPay를 선언하는게 좋겠다!
        /* 20 -> 코드 삭제 해주고 함수 선언해주기!
        Pay pay; //13 - 선언 완료 -> 조건문 속 Pay들 빼주고 pay = new ~~ 형식으로 작성해주기
        // 5 - 여기를 줄일 수 있겠다! 종류 별로 나뉘어 지니까 인터페이스 Pay라고 만들어서 처리해보자!
        if (option.equals("kakao")) {
            // 10 - 그러면 해당 Pay들을 Pay pay로 바꿀 수 있겠다.
            // Pay pay = new KakaoPay(); 14 - Pay 빼기
            pay = new KakaoPay();
            //result = pay.pay(amount);

        } else if (option.equals("naver")) {
            //Pay pay = new NaverPay(); 15 - Pay 빼기
            //result = pay.pay(amount);
            pay = new NaverPay();
            // 11 - Pay pay로 바꾸기 완료
        } else {
            pay = null; // 16 - pay = null 해주기
            System.out.println("결제 수단이 없습니다.");
            //result = false; // 20 - 맨위의 초기화 과정과 코드가 겹치니까 코드 삭제하기
        }
        */

        /* 32 - 이 코드를 삭제하고 result = pay.pay(amount)를 boolean result = false와 코드 합쳐주기!!
        // result = pay.pay(amount); // 12 - 코드 중복 밖으로 빼기! + pay에서 오류! Pay pay를 조건문 밖에 선언하기!!
        // 12 + 이 코드는 pay != 일때만 가동되게 조건문 짜기
        // 17 - 12번에서 했던 조건문 짜기
        if(pay != null) {
            result = pay.pay(amount);
        }
         */
        boolean result = pay.pay(amount); // 33 - 오류 발생 -> PayStore에 가서 리턴값 수정

        // 18 - result 초기화 안된 오류 발생 맨위에서 처음에 false로 초기화 해주기 -> 이제 조건문을 메서드로 뺄 수 있을 것 같이 생겼으므로 메서드로 빼보기
        if (result) {
                System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
    /*
    // 26 - 메서드를 생성할 클래스를 만들었으니 메서드 삭제!
    // 19 - 조건문 메서드로 빼보기 Pay형태로 return하고 매개변수로 String option받아 올거임!
    public Pay findPay(String option){
        Pay pay;
        if (option.equals("kakao")) {
            pay = new KakaoPay();
        } else if (option.equals("naver")) {
            pay = new NaverPay();
        } else {
            pay = null; // 16 - pay = null 해주기
            System.out.println("결제 수단이 없습니다.");
        }
        return pay;
    }
    */
}
