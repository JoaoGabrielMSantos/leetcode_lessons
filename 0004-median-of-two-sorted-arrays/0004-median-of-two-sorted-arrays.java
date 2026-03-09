import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] mergedArrays = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, mergedArrays, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArrays, nums1.length, nums2.length);

        Arrays.sort(mergedArrays);

        int size = mergedArrays.length;
        double median;

        if (size % 2 == 0) {
            median = (mergedArrays[size / 2 - 1] + mergedArrays[size / 2]) / 2.0;
        } else {
            median = mergedArrays[size / 2];
        }

        return median;
    }
}