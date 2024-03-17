public class MajorityElement {
    /*
     * 使用摩尔投票法
     */
    public static int getMajority(int[] nums) {
        int majorityNum = 0;
        int maxTime = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || maxTime == 0) {
                majorityNum = nums[i];
                maxTime++;
            } else {
                if (nums[i] == majorityNum) {
                    maxTime++;
                } else {
                    maxTime--;
                }
            }
        }

        return majorityNum;
    }

    public static void main(String[] args) {
        int[] nums = {6,1,6,9,2,6,7,6,6,5,6,6};
        System.out.println(getMajority(nums));
    }
}
