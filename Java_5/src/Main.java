import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Collection<String> collection;

        List<Integer> list = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        list.add(15);
        list.add(5);
        list.add(65);
        list.add(25);

        System.out.println(list);

        Queue<String> queue;

        Set<String> set = new HashSet<>();

        set.add("15");
        set.add("5");
        set.add("5");
        set.add("25");

        System.out.println(set);

        Map<Integer, String> map = new HashMap<>();

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });

        System.out.println(list);

        list.sort((integer, t1) -> t1 - integer);

        System.out.println(list);

        list.sort(Comparator.comparingInt(integer -> integer));

        System.out.println(list);

        List<Window> windows = new ArrayList<>();

        windows.add(new Window(10, 10, "first"));
        windows.add(new Window(15, 2, "second"));
        windows.add(new Window(2, 50, "third"));
        windows.add(new Window(150, 2, "new"));
        windows.add(new Window(10, 10, "old"));

        System.out.println(windows);

        windows.sort((window1, window2) -> window1.getSquare() - window2.getSquare());

        System.out.println(windows);

//        windows.sort(Comparator.naturalOrder());

        System.out.println(windows);

        Set<Window> treeSet = new TreeSet<>();

        treeSet.add(new Window(10, 10, "first"));
        treeSet.add(new Window(15, 2, "second"));
        treeSet.add(new Window(2, 50, "third"));
        treeSet.add(new Window(150, 2, "new"));
        treeSet.add(new Window(10, 10, "old"));

        System.out.println(treeSet);

        System.out.println(treeSet.stream().anyMatch((element) -> element.equals(new Window(10,10,"first"))));
        treeSet.stream().allMatch(window -> window.equals(new Window(20,10,"2")));
    }
}
