import java.util.Scanner;
/*
练习二:
找出一个整数数组中子数组之和的最大值
*/
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组的长度:");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("请逐个输入数组的值并以空格隔开:");
        for(int i = 0;i < len;i++){
            array[i]=sc.nextInt();
//            System.out.println(array[i]+" ");
        }
        int result = 0;
        result = fun(array);
        System.out.println("最大子序列和为:"+result);
    }
    static int fun(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int dp = nums[0];
        int res = dp;
        for(int i = 1;i < nums.length;i++){
            dp = nums[i] + dp > nums[i]?nums[i]+dp:nums[i];  //线性dp
            if(dp > res) res = dp;
        }
        return res;
    }
}
