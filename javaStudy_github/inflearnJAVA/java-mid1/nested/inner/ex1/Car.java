package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this); // Engine 을 만들떄 Car에 대해서 넘겨야 하므로 나 자신 this를 넘긴다.
    }

    // Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }
    // Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료 ");
    }
}
