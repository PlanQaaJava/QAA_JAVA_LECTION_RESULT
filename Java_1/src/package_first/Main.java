package package_first;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String s = "sdsd";

        FirstClass firstClass = new FirstClass(1, "string");
        FirstClass firstClass2 = new FirstClass();

        firstClass.print();
        int j = FirstClass.getI();
        System.out.println(j);

        firstClass.set(15);
        System.out.println(firstClass.getN());
    }
}
