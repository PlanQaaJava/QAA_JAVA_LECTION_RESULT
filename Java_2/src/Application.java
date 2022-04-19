import human.Dev;
import human.Develop;
import human.Employee;
import human.Product;
import human.Qa;
import human.Sell;
import package_1.Child;
import package_1.Parent;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Employee emp1 = new Qa("Dimka", "QA");
        Dev emp2 = new Dev("Igor", "Dev");

        emp1.working();
//        System.out.println(emp1.getName());
        emp1.setAge(28);
//        System.out.println(emp1.getAge());

        emp2.development();

        Sell sell = new Product("Ignat", "Product");
        sell.selling();

        int[] array = new int[]{1,2,3,4,5};
        Employee[] employees = new Employee[]{emp1, emp2, new Product("Petr", "Product")};

//        for(int element:array){
//            System.out.println(element);
//        }

//        List<Employee> list = new ArrayList<>();
//        list.add(emp1);
//        System.out.println(list);
//        System.out.println(list.isEmpty());
//        System.out.println(list.get(0));
//        list.remove(emp1);
//        System.out.println(list);
//        System.out.println(list.isEmpty());

        System.out.println(emp2 instanceof Sell);

//        someMethod(emp1);
        someMethod(emp2);
    }

    static void someMethod(Develop develop){
        develop.development();
    }
}
