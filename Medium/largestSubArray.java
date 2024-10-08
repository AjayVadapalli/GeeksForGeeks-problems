import java.util.HashMap;

class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        int sum =0;
        int max= 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K){
                max = i+1;
            }
            if(map.containsKey(sum-K)){
                max = Math.max(max,i-map.get(sum-K));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
    }
}
