    package gfg;
    import java.util.Arrays;
    public class aggressive_cows {
        public boolean canPlaceCows(int[] stalls, int k, int distance) {
            int count = 1; 
            int lastPosition = stalls[0]; 

            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - lastPosition >= distance) {
                    count++;
                    lastPosition = stalls[i];
                    if (count == k) {
                        return true; 
                    }
                }
            }
            return false; 
        }
        public int aggressiveCows(int[] stalls, int k) {
            Arrays.sort(stalls);
            int left = 1; 
            int right = stalls[stalls.length - 1] - stalls[0]; 
            int result = 0; 

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (canPlaceCows(stalls, k, mid)) {
                    result = mid; 
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }
            return result;
        }
    //     public static void main(String[] args) {
    //     aggressive_cows ac = new aggressive_cows();
    //         int[] stalls = {2, 12, 11, 3, 26, 7};
    //         int k = 5;
    //         int result = ac.aggressiveCows(stalls, k);
    //         System.out.println("The largest minimum distance is: " + result);
    // }
    }
    
    
    