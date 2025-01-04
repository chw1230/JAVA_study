package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); // Engine 을 만들떄 Car에 대해서 넘겨야 하므로 나 자신 this를 넘긴다.
    }


    // Car에서만 사용
    private class Engine {
        public void start() {
            System.out.println("충전 레벨 확인 : " + chargeLevel); // 내부 클래스이니까 바깥 클래스 인스턴스에 그냥 접근가능
            System.out.println(model + "의 엔진을 구동합니다."); // 내부 클래스이니까 바깥 클래스 인스턴스에 그냥 접근가능
        }
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료 ");
    }
}
