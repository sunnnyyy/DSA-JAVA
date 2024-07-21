package Recursion;

import java.util.ArrayList;
import java.util.List;

class SubSetArray {
    
    static List<List<Integer>> returnSubset(int []nums, List<Integer> currentSubset, int index) {
        List<List<Integer>> subsets = new ArrayList<>();
   
   // Base case: if we've considered all elements
   if (index == nums.length) {
       // Print the current subset
       System.out.println(currentSubset);
       // Add a copy of the current subset to the result list
       subsets.add(new ArrayList<>(currentSubset));
       return subsets;
   }
   
   // Include the current element
   currentSubset.add(nums[index]);
   subsets.addAll(returnSubset(nums, currentSubset, index + 1));
   
   // Exclude the current element (backtrack)
   currentSubset.remove(currentSubset.size() - 1);
   subsets.addAll(returnSubset(nums, currentSubset, index + 1));
   
   return subsets;

}

    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(returnSubset(nums, new ArrayList<>(), 0));
         
    }

}