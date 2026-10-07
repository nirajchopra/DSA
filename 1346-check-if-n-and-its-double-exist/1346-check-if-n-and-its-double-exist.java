class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int target = arr[i] * 2;

            int start  = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target && mid != i){
                return true;
            } else if(arr[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna