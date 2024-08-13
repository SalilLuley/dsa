package Recursion;

public class Multiplication {
    public static void main(String[] args) {
        int result = multiplyTwoIntegers(4,5);
        System.out.println(result);
    }

    public static int multiplyTwoIntegers(int m, int n){
        return multiplyTwoIntegers(m,n, 0);
    }

    public static int multiplyTwoIntegers(int m, int n, int sum){
        if (m == 0 || n == 0) {
            return sum;
        }
        return multiplyTwoIntegers(m - 1,n, sum + n);
    }
}
