import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int maximum = arr[0];
        int minimum = arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(maximum < arr[i]){
                maximum = arr[i];
            }
            if(minimum > arr[i]){
                minimum = arr[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(minimum);
        list.add(maximum);
        
        return list;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna