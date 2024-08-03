import java.util.ArrayList;
import java.util.List;

public class ArrayListBasic {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(1);
        
        list2.add(1);
        list2.add(2);
        list2.add(3);
        // NOTE: All method is from Collection interface not from List interface

        // System.out.println(list);
        // System.out.println(list.size());
        
        // System.out.println(list.contains(200));
        // System.out.println(list.contains(10));
        
        // list.remove(Integer.valueOf(1)); // will remove value
        // list.remove(1); // will remove index // NOTE:: this method from LIST interface
        // System.out.println(list);
        
        // list.addAll(list2);
        // list.removeAll(list2); // will remove common elements
        // list.retainAll(list2); //  will remove which value is not common

        // Object obj[] = list.toArray();
        
        // for(Object o: obj) {
            // System.out.println(  o instanceof Integer);
            // System.out.println(  o );
        // }
        System.out.println(list);



        // NOTE: below methods are from LIST interface

        System.out.println(list.get(0));
        list.set(0, 100);
        System.out.println(list.get(0));
        
        list.add(2, 200);
        list.add(2, 200);
        System.out.println(list);
        System.out.println(list.indexOf(200)); // if not found return -1
        System.out.println(list.lastIndexOf(200)); 



        // int[] array = {5, 2, 8, 1, 3};
        // int key = 8;
        //IMP:  boolean found = Arrays.stream(array).anyMatch(value -> value == key);

    }
}
