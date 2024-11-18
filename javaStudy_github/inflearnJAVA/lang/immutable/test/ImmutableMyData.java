package lang.immutable.test;

public class ImmutableMyData {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public ImmutableMyData WithYear(int year){
        return new ImmutableMyData(year,month,day);
    }
    public ImmutableMyData WithMonth(int month){
        return new ImmutableMyData(year,month,day);
    }
    public ImmutableMyData WithDay(int day){
        return new ImmutableMyData(year,month,day);
    }
/*
불변 객체에서 값을 변경하는 경우 WithYear() 처럼 with로 시작하는 경우가 많다.
 불변 객체의 메서드가 "with"로 이름 지어진 경우, 그 메서드가 지정된 수정사항을
포함하는 객체의 새 인스턴스를 반환한다는 사실을 뜻한다.
정리하면 "with"는 관례처럼 사용되는데, 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포
함하는 과정을 간결하게 표현한다.
 */
    @Override
    public String toString() {
        return year +"-"+ month +"-"+ day;
    }
}
