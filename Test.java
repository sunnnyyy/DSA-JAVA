public class Test {
    
    public static int sum(int[] arr, int index, int ans) {
        if(arr.length == index)
            return 0;

        // int sum = 0;
        int sum = arr[index] + sum(arr, index+1, ans);
        ans = sum + ans; 
        return ans;   

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        // System.out.println(sum(arr, 0, 0));
        doPractice();
    }

    private static void doPractice() {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        String s = "iiiif";
        StringBuilder sb = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c);
        }

        System.out.println(sb);
        if(sb.toString().equals(s))
            System.out.println("true");
        else 
            System.out.println("false");
        
        
        System.out.println(s.equals(new StringBuilder(s).reverse().toString()));
        
    }

}
