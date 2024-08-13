package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int result = countZerosRec(10204);
        System.out.println(result);
    }

    public static int countZerosRec(int input){
        if (input == 0) {
            return 1;
        }
        return countZerosRec(input, 0);
    }

    public static int countZerosRec(int input,  int sum){
        if (input == 0) {
            return sum;
        }

        int digit = input % 10;

        if(digit == 0) {
            sum+=1;
        }

        return countZerosRec(input/10, sum);
    }
}
