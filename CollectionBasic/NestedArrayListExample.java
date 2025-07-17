import java.util.ArrayList;

public class NestedArrayListExample {
    public static void main(String[] args) {
        // Create individual ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(6);
        
        list1.add(111);
        // Create a nested ArrayList
        ArrayList<ArrayList<Integer>> nestedList = new ArrayList<>();
        list3.add(5);
        list3.add(6);
        nestedList.add(list1);
        nestedList.add(list2);
        nestedList.add(list3);
        
        ArrayList<ArrayList<Integer>> nestedList_1 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(400);
        list4.add(500);
        list4.add(600);
        nestedList_1.add(list4);
        System.out.println("Nested ArrayList_1: " + nestedList_1);
        nestedList.addAll(nestedList_1);
        // Print the nested ArrayList
        System.out.println("Nested ArrayList: " + nestedList);

        // Accessing elements in the nested ArrayList
        // for (ArrayList<Integer> subList : nestedList) {
        //     System.out.println("SubList: " + subList);
        // }
    }
}
