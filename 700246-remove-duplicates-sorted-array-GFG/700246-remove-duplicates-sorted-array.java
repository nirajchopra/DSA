import java.util.*;

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        
        int i = 0;
        
        for(int j=0; j<arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int j=0; j <= i; j++){
            result.add(arr[j]);
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna