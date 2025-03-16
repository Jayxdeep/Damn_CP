import java.util.Arrays;

public class changeval {
    public static void main(String[] args) {
        int arr[]= {1,32,32,52,56};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums)
    {
        nums[0]=90;
    }
}
