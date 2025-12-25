package interviewpractice.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveNegativeNumberFirst {
    public static void main(String[] args) {
        int[] arr = {531, -788, -137, 554, -364, 790, -50, -158, -346, 582};
        int[] tmpArr = new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                int tmp = arr[j];
                arr[j++] = arr[i];
                arr[i] = tmp;
            }
        }

        System.out.println(Arrays.toString(arr));

        j=0;
        for (int k : arr) {
            if (k < 0)
                tmpArr[j++] = k;
        }
        for (int k : arr) {
            if (k >= 0)
                tmpArr[j++] = k;
        }

//        System.out.println(DSA.Arrays.toString(tmpArr));

        // using Stream API

        int[] array = IntStream.concat(
                Arrays.stream(arr).filter(n -> n < 0),
                Arrays.stream(arr).filter(n -> n >= 0)
        ).toArray();

        System.out.println(Arrays.toString(array));

    }


}
