package cond.ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 6.1;

        if( 9 <= rating ) {
            System.out.println(" '어바웃타임'을 추천합니다. ");
        }
        if( 8 <= rating ) {
            System.out.println(" '토이 스토리'를 추천합니다. ");
        }
        if( 7 <= rating ) {
            System.out.println(" '고질라'를 추천합니다. ");
        }
        if( rating < 7){
            System.out.println("추천영화가 없습니다.");
        }
    }
}
