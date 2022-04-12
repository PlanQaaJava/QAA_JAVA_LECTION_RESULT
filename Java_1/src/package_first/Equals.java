package package_first;

public class Equals {

    public static void main(String[] args) {
        int i = 50;
        int j = 20;

        String s1 = "asd";
        String s2 = "asd";
        String s3 = s1;

        System.out.println(s1.equals(s2));

        if (i > j) {
            System.out.println("Большее число - j -  " + j);
            if(true){

            }
        } else if (i == j) {

        } else {

        }
        ;

        switch (i) {
            case (10):
                System.out.println("10");
                break;
            case (5):
                System.out.println("5");
                break;
            default:
                System.out.println("default");
        }
    }
}
