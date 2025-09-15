
public class arrays {
    public void total(int n){
        int sum = 0;
        while(n != 0){
            int mod = n % 10;
            sum +=  mod;
            n /= 10; 

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr = {111,202,330,555};
        for (int i = 0; i < arr.length; i++) {
            sum_num hello = new  sum_num();
            hello.total(arr[i]);

        }
        

    }
}
