import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListBasic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
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
        // list.remove(1); // will remove index // NOTE:: this method from LIST
        // interface
        // System.out.println(list);

        // list.addAll(list2);
        // list.removeAll(list2); // will remove common elements
        // list.retainAll(list2); // will remove which value is not common

        // Object obj[] = list.toArray();

        // for(Object o: obj) {
        // System.out.println( o instanceof Integer);
        // System.out.println( o );
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
        // IMP: boolean found = Arrays.stream(array).anyMatch(value -> value == key);

        // Print the current subset
        // List<List<Integer>> subsets = new ArrayList<>();
        // subsets.add(new ArrayList<>(currentSubset));
        // return subsets;
        // Add a copy of the current subset to the result list

        // return List.of(new ArrayList<>(currentSubset));

        // return returnSubset(nums, new ArrayList<>(), 0);

        // List<Integer> nums = new ArrayList<>();
        // nums.sort((a,b) -> a-b);

        // ArrayList<Integer> arrayList = new ArrayList<>();
        // arrayList.add(10);
        // arrayList.add(20);
        // arrayList.add(30);

        // // Convert ArrayList to Array
        // Integer[] array = arrayList.toArray(new Integer[0]);

        // // Print the array
        // for (int element : array) {
        // System.out.println(element);
        // }

        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.add(10L);
        arrayList.add(20L);
        arrayList.add(30L);

        // Convert ArrayList to Array
        Long[] array = arrayList.toArray(new Long[0]);

        // Print the array
        for (Long element : array) {
            System.out.println(element);
        }

    }

    public static int firstUniqChar(String s) {
        // Step 1: Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Step 2: Populate the HashMap with the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 3: Find the first unique character by checking the HashMap
        for (int i = 0; i < s.length(); i++) {
            if (freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no unique character is found, return -1
        return -1;
    }
}
