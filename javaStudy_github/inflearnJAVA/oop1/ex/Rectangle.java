package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea(){
        return width * height;
    }

    int calculatePerimeter(){
        return 2 * (width + height);

    }

    boolean isSquare() {
        if (width == height){
            return true;
        }
        else {
            return false;
        }
    }
    /*
    void showStatus() {
        System.out.println("넓이: " + calculateArea());
        System.out.println("둘레 길이: " + calculatePerimeter());
        System.out.println("정사각형 여부: " + isSquare());
    }
     */
}
