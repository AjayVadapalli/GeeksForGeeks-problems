//{ Driver Code Starts
import java.util.*;

public class secondLargest {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0) {
                String[] arr1Str = sc.nextLine().split(" ");
                int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
                Solution ob = new Solution();
                int ans = ob.getSecondLargest(arr);
                System.out.println(ans);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int large = arr[0];
        int slarge = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>slarge && arr[i]!=large){
                slarge = arr[i];
            }
        }
        return slarge;
    }
}