package lang.object.test;

import java.util.Objects;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    // alt + insert 눌러서 이퀄이랑 두스트링 작성하기!!!
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }
}


