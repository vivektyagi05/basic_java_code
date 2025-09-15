public class sum_num{
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
        sum_num hello = new  sum_num();
        hello.total(111);
        
        
    }
}
