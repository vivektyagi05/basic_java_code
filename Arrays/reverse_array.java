public class reverse_array {
    void reverse_array_num(int[] nums,int start,int end ){
        int temp;
        while{start<end}{
            nums[temp] = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;

        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        reverse_array_num(num,0,nums.length-1);

    }
}
