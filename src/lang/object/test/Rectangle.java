package lang.object.test;

import java.util.Objects;

public class Rectangle {
    // 필드
    private int width;
    private int height;

    // 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 메서드
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle rectangle)) return false;
        return width == rectangle.width && height == rectangle.height;
    }
}
