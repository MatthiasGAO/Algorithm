public class RemoveElement {
    /**
     * 
     * @param nums
     * @param val
     * @return
     * 
     * 第二种解法（比较笨的解法）：将保留的数字存在另外一个数组/array list里，然后统一存到nums中
     */
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++;
            }
        }
        return k;
    }
}
