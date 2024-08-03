package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
     public static void main(String[] args) {
        
        // int []arr1 = {10,9,8,7,6,5,4,3,2,1};
        int []arr1 = {1,2,3,4,5,6};
        int []arr2 = {2,5,9,10,15,20};
        int []ans = new int[arr1.length + arr2.length];
        // int s = 0;
        // int e = arr.length;
        mergeAndSortSortedArray(arr1, arr2, ans);
        System.out.println(Arrays.toString(ans));
    }

    public static void mergeAndSortSortedArray(int []arr1, int []arr2, int []ans) {

        int i = 0;
        int j = 0;
        int arr1en = arr1.length;
        int arr2len = arr2.length;
        int k = 0;
        while (i < arr1en && j < arr2len) {
            
            if(arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            } 
            else {
                ans[k++] = arr2[j++];
            }

        }

        
        while (i < arr1en) {
            ans[k++] = arr1[i++];
        }

        while (j < arr2len) {
            ans[k++] = arr2[j++];
        }

    }
}
