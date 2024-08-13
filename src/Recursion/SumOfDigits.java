package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int result = sumOfDigits(12345);
        System.out.println(result);
    }

    public static int sumOfDigits(int input){
        return sumOfDigits(input, 0);
    }

    public static int sumOfDigits(int input, int sum){
        // Write your code here
        if (input <=0 ) {
            return sum;
        }
        int digit = input % 10;
        return sumOfDigits(input /10, sum + digit);
    }

}
