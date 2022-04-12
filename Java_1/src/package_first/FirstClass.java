package package_first;

public class FirstClass {

    public static int i;
    private int n;
    private int g;
    private String s;

    public FirstClass() {
    }

    public FirstClass(int i, String s) {
        this.s = s;
        i++;
    }

    public FirstClass(int n, int g, String s) {
        this.n = n;
        this.g = g;
        this.s = s;
    }

    public int getN() {
        return n;
    }

    public int getG() {
        return g;
    }

    public String getS() {
        return s;
    }

    public static void setI(int i) {
        FirstClass.i = i;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void print() {
        System.out.println(s);
    }

    public static int getI() {
        return i;
    }

    public void set(int n) {
        this.n = n;
    }

    public int set(int n, String s) {
        return n;
    }
}
