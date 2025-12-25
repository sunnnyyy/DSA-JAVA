package interviewpractice.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import static java.lang.System.out;
import static java.lang.Math.sqrt;
public class MoveZeroOne {
    public static void main(String[] args) {


//        int[] arr = {0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0};
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        out.println("hellow");
        out.println(sqrt(9));


        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int tmp = arr[j];
                arr[j++] = arr[i];
                arr[i] = tmp;
            }
        }
        // OR
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            while (s < e && arr[s] != 1)
                s++;
            while (s < e && arr[e] != 0)
                e--;

            if (s < e && arr[s] == 1 && arr[e] == 0) {
                arr[s++] = 0;
                arr[e--] = 1;
            }
        }

        // it is correct but non 0 value are not maintaining the correct order it will only good for 0,1 question
        System.out.println(Arrays.toString(arr));

        int[] array = IntStream.concat(
                Arrays.stream(arr).filter(n -> n == 0),
                Arrays.stream(arr).filter(n -> n != 0)
        ).toArray();

        System.out.println(Arrays.toString(array));
    }
}

