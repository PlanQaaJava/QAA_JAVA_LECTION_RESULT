import java.util.Comparator;
import java.util.Objects;

public class Window implements Comparable<Window>{

    private final int width;
    private final int length;
    private final int square;

    private final String type;

    public Window(int width, int length, String type) {
        this.width = width;
        this.length = length;
        this.square = width * length;
        this.type = type;
    }

    public int getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "\n" +
                "width=" + width +
                ", length=" + length +
                ", square=" + square +
                ", type=" + type;
    }

    @Override
    public int compareTo(Window window) {
        if (window.square == square){
            return type.compareTo(window.type);
        }
        return window.square - square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return width == window.width && length == window.length && square == window.square && Objects.equals(type, window.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, square, type);
    }
}
