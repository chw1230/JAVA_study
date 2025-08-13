package extends1.ex;

public class Album  extends Item{
    String artist;

    public Album(String name, int price, String artist) {
        super(name,price);
        this.artist = artist;
    }

    @Override
    public void print(){
        super.print(); //이거를 생각하지 못했음 나머지는 다 잘했는데 ㅜㅜㅜ
        System.out.println("- 아티스트: "+artist);
    }
}
