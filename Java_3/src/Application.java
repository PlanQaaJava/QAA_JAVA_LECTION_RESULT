import enums.MyEnum;
import pac_1.Child;
import pac_1.Parent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Application {

    public static void main(String[] args) {

        GenericClass<Child> genericClass = new GenericClass<>();
        GenericClass<Parent> genericClass1 = new GenericClass<>();

        List<String> list = new ArrayList<>();

        list.add("sdasda");
        list.add("ghjr");
        list.add("geg");
        list.add("fdgbdfhgd");
        list.add("sdasda");

        System.out.println(list);
        LinkedList<String> linkedList = new LinkedList<>();

        Set<String> set = new TreeSet<>();

//        set.add("sdasda");
//        set.add("ghjr");
//        set.add("geg");
//        set.add("fdgbdfhgd");
//        set.add("sdasda");

//        System.out.println(set);

        Map<String, Child> map = new HashMap<>();

        map.put("first", new Child("string1", 10));
        map.put("second", new Child("string2", 20));
        map.put("third", new Child("string3", 30));
        map.put("fourth", new Child("string4", 40));

//        System.out.println(map.get("second"));
//        System.out.println(map.get("second").equals(new Child("string2", 20)));

        MyEnum myEnum = MyEnum.FIRST;

        System.out.println(myEnum.ordinal());

        Child.test(5);
    }
}
