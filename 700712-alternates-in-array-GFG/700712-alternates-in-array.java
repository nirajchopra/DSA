class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                result.add(arr[i]);
            }
        }
        
        return result;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna