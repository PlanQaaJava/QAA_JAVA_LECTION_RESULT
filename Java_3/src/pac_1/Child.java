package pac_1;

import exception.MyException;

import java.util.Objects;

public class Child extends Parent {

    private String first;
    private int second;

    public Child(String first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object child) {
        return first.equals(((Child) child).first) &&
                second == ((Child) child).second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Child{" +
                "first='" + first + '\'' +
                ", second=" + second +
                '}';
    }

    public static void test(int i) {
        try {
            if (i > 10) {
                System.out.println("OK");
            } else {
                throw new MyException("Is not OK");
            }
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }
}
