public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicate(int[] nums) {
        int k = 0; // 慢指针，同时兼顾统计作用
        for (int i = 0; i < nums.length; i++) { // i是快指针
            if (i > 0) {
                if (nums[i] != nums[i - 1]) {
                    nums[k] = nums[i];
                    k++;
                }
            } else {
                k++;
            }
        }
        return k;
    }
    
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicate(nums));
    }
}
