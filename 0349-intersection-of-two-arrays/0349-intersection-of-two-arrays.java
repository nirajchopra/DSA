class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                j++;
            }
            else {
                // Same element found
                if (result.size() == 0 ||
                    result.get(result.size() - 1) != nums1[i]) {

                    result.add(nums1[i]);
                }

                i++;
                j++;
            }
        }

        return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    
    }
}