
public class basic {
    public static void main(String[] args) {
        int[] arr1 = new int[5];

        // insert

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 25;
        arr1[4] = 35;

        // access 
        System.out.println("access index 2:"+ arr1[1]);

        // update

        arr1[2] = 25;
        arr1[3] = 30;

        System.out.println("change : "+ arr1[2] + arr1[3]);

        // traverse 

        for(int i=0; i<arr1.length; i++){
            System.out.println("value of index" + i+ " => "+ arr1[i]);
        }

        // sum of arr elements

        int sum = 0;

        for(int j=1; j<arr1.length;j++){

            sum += arr1[j];
        }
        System.out.println("arr of length" + sum);


        // even number of arr1- -

        for(int j=1; j<arr1.length;j++){

            if(arr1[j] % 2 ==0){
                System.out.println("even number " + arr1[j]);
            }
        }

        // reverse arr1

        int len = arr1.length;

        for(int k=len-1; k>=0; k--){

            System.out.println( arr1[k] + ",");

        }

        // max element of array
        int max = arr1[0];
        
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }

        System.out.println("largest number => "+ max);


        // palindrome
        int n = arr1.length;
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr1[i] != arr1[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }

    }
}
