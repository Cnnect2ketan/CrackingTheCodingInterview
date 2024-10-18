import java.util.Arrays;

public class SumOfThree {

    public static boolean findSumOfThree(int[] nums, int target) {

        // Replace this placeholder return statement with your code
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int start =0;
            int end = nums.length-1;
            while(start<end){
                if(start ==i){
                    start++;
                    continue;
                }
                if(end == i){
                    end --;
                    continue;
                }
                int sum = first + nums[start] + nums[end];
                if(sum == target)
                    return true;
                if(sum<target)
                    start = start +1;
                else
                    end = end -1;

            }
        }

        return false;
    }

}
