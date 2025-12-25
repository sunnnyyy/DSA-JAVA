package interviewpractice.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {

        String str = "hello world java how are you";
        String splitArr[] = str.split(" ");
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        for (int i = splitArr.length - 1; i >= 0; i--) {
            System.out.print(splitArr[i] + " ");
        }
        System.out.println();
        System.out.println(str.toCharArray());
        // using stream api
        System.out.println(Arrays.stream(
                        str.split(" "))
                        .map(x -> new StringBuilder(x)
                        .reverse().toString())
                        .collect(Collectors.joining(" ")));

        String result = Arrays.stream(str.split(" "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));
        System.out.println(result);


        ArrayList<String> list = Arrays.stream(str.split(" "))
                .collect(Collectors.toCollection(ArrayList::new));
        // converting string to arraylist
        System.out.println(list);

    }
}
