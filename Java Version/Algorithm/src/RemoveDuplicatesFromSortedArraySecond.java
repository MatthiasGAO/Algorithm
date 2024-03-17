import java.util.Arrays;

public class RemoveDuplicatesFromSortedArraySecond {
    public static int removeDuplicates(int[] nums) {
        int k = 1; // 记录符合要求的数字数量
        int index = 1; // 记录新的复合要求的数字需要存储的位置， index是慢指针
        boolean dup = false; // 记录重复状态
        for (int i = 1; i < nums.length; i++) { // 遍历每个数字， i 是快指针
            if (nums[i] == nums[i - 1]) { // 出现重复
                if (dup == false) { // 第一次重复，即出现连续两个数字相等，但不是连续三个数字或更多相等，符合要求数字+1
                    dup = true; // 记录重复
                    nums[index] = nums[i]; // 连续两个数字相同可接受，正常存储
                    index++; // 更新存储位置，挪到下一位，如果下一位还是重复，则不更新，该位置为下一个符合要求的数字的存储位
                    k++; // 更新数量
                } else { // 出现连续三个或以上数字重复
                    continue; // 不更新数量和存储位置，存储位置依然等待存储下一个符合要求的数字
                }
            } else { // 没有出现重复，符合要求数字+1
                dup = false; // 记录不重复
                nums[index] = nums[i]; // 正常存储
                index++; // 更新存储位置
                k++; // 更新数量
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int[] nums2 = { 1, 1, 1, 2, 2, 3 };
        System.out.println(removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));
    }
    
}
