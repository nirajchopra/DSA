import java.util.*;

class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int maxNumber = arr[0];
		int minNumber = arr[0];
		

		for (int i = 0; i < arr.length; i++) {
			if (maxNumber < arr[i]) {
				maxNumber = arr[i];
			} else if (minNumber > arr[i]) {
				minNumber = arr[i];
			}
		}
		
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(minNumber);
	    list.add(maxNumber);
		
		return list;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna