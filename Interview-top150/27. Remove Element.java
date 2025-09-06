// 116 / 116 test cases passed.
// Status: Accepted
// Runtime: 0 ms
// Memory Usage: 42.1 MB

//Time Complexity O(n)
//Space Complexity O(1)

class Solution {
    public int removeElement(int[] nums, int val) {
        //establishing a point to count how many indexes don't equal val as per requested in the problem 
        // also as a pointer that checks where we should place the next value that doesn't equal val
        int point = 0; 
        for(int i = 0 ; i < nums.length ; i++){ //cycling through the array 
            if(nums[i] != val){ //checking which elements don't match val
                nums[point] = nums[i]; // replacing it at the beggining of the array
                point++; // increasing point to calculate how many don't equal val and moving to the next place in array
            }
        }
        return point;
    }
}
