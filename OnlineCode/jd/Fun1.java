package OnlineCode.jd;

import java.util.Arrays;

public class Fun1 {

    public static void main(String[] args) {

        int []nums ={5,7,2,3,6,8,4};
        Arrays.sort(nums);
        Integer[] array = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        int left=0 , right =nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right]=temp;
            left++;
            right--;
        }

        for(int i=0;i<nums.length ;i++) System.out.print(nums[i]+" ");
    }
}
