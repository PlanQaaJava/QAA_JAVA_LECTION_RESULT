import human.Dev;
import human.Employee;
import human.Product;
import human.Qa;
import human.Testing;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Product product = new Product("Igor", "PM");
//        product.working();
//        product.selling();
//
        Qa qa = new Qa("Petr", "QA");
//        qa.development();
//        qa.testing();
//
//        Dev dev = new Dev("Sebastian", "Java");
//        dev.development();

        Employee employee = new Qa("Grisha", "SDET");
        Employee employee2 = new Dev("Anton", "C#");
        Employee employee3 = new Product("Masha", "PM");

//        employee.working();
//        employee2.working();
//        employee3.working();

        Testing testing = new Qa("name", "posit");
//        testing.testing();

//        if (product instanceof Testing) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(array);

//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }

        Qa[] qaArray = new Qa[]{new Qa("new", "qa"), qa};

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("String");
        arrayList.add("String2");
        arrayList.add("String3");

//        System.out.println(arrayList.get(1));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(product);
        employees.add(qa);
        employees.add(employee2);
        employees.add(employee);

        someMethod(qa);
    }

    public static void someMethod(Testing testing) {
        testing.testing();
    }
}
