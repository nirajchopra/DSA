import java.util.*;

class Solution {
    public boolean checkPermutation(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        for (int i = 0; i < b.length; i++) {

            if (!map.containsKey(b[i])) {
                return false;
            }

            map.put(b[i], map.get(b[i]) - 1);

            if (map.get(b[i]) == 0) {
                map.remove(b[i]);
            }
        }

        return map.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna