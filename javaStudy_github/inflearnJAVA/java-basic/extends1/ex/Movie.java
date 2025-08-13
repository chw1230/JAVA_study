package extends1.ex;

public class Movie  extends Item{
    String director;
    String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name,price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print(){
        super.print(); //이거를 생각하지 못했음 나머지는 다 잘했는데 ㅜㅜㅜ
        System.out.println("- 감독: "+director+", 배우: "+actor);
    }
}
