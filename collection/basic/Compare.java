package collection.basic;

import java.util.*;

public class Compare {
    public static void main(String[] args) {

        Integer[] arr = { 5, 1, 7, 2, 8, 4 };
        Arrays.sort(arr, new ReverseCmp());
        for (int a : arr) {
            System.out.print(a + " ");
        }

        // List<Student> students = new ArrayList<>();
        //
        // students.add(new Student(19, "Vipul", 68));
        // students.add(new Student(23, "Love", 87));
        // students.add(new Student(23, "Ankit", 55));
        // students.add(new Student(7, "Billu", 13));
        //
        // System.out.println(students);

        // Collections.sort(students, new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {
        // return o1.weight-o2.weight;
        // }
        // });

        // Collections.sort(students,new WeightComparator());

        // Collections.sort(students,(o1,o2) -> o1.weight - o2.weight );

        // comparing
        // thencomparing

        // System.out.println(students);

        // List<Integer> list = new ArrayList<>();
        // list.add(15);
        // list.add(8);
        // list.add(2);
        // list.add(90);
        // System.out.println(list);
        //
        // Collections.sort(list);
        // System.out.println(list);
    }
}