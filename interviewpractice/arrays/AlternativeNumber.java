package interviewpractice.arrays;

import java.util.stream.IntStream;

public class AlternativeNumber {
    public static void main(String[] args) {
        int arr[] = {895, 861, 648, 697, 237, 628, 138, 645, 128, 98};

        IntStream.range(0, arr.length).filter(x -> x%2 ==0).map(x -> arr[x]).forEach(System.out::println);

        IntStream.range(0, arr.length).filter(x -> x%2 ==0).forEach(x -> System.out.print(arr[x] + " "));



    }
}
