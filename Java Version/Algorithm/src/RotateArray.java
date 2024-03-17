import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int length = nums.length;

        int currentRemoveIndex = length - k;
        int boundNum = nums[currentRemoveIndex - 1];

        for (int i = 0; i < k; i++) {
            int removeNum = nums[currentRemoveIndex];
            int frontNum = nums[i];
            nums[i] = removeNum;
            nums[currentRemoveIndex - 1] = frontNum;
            nums[currentRemoveIndex] = boundNum;
            currentRemoveIndex++;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = { -1,-100, 3,99 };
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
