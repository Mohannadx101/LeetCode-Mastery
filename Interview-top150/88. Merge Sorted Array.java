//88. Merge Sorted Array 
//59 / 59 test cases passed.
//Status: Accepted
//Runtime: 1 ms
//Memory Usage: 42.4 MB
//https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // We are traversing through nums2 and appending the elemnt to the end of nums i 
       for (int j = 0, i = m; j < n ; j++){
        nums1[i] = nums2[j];
        i++;
       }
       //then using the sort function to sort the nums1 array
       Arrays.sort(nums1);
    }
}
