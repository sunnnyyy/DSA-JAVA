import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasic {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();        // 0(1)       // un-order data
        // Set<Integer> set = new LinkedHashSet<>(); //  0(n)      // ordered data
        Set<Integer> set = new TreeSet<>();         //   0 (logN) // Sorted data
        set.add(10);
        set.add(50);
        set.add(90);
        set.add(30);
        set.add(20);
        set.add(20);
        set.add(20);
        set.remove(20);
        System.out.println(set.contains(10));
    }
}
