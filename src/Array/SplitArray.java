package Array;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = new int[]{34,78,90,15,67};
        System.out.println(splitArray(arr));
    }

    public  static  boolean splitArray(int[] input) {
        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 5 == 0) {
                counterA+=1;
            }
            if (input[i] % 3 == 0 && input[i] % 5 != 0) {
                counterB+=1;
            }
            if (input[i] % 3 != 0 && input[i] % 5 != 0) {
                if (counterA > counterB) {
                    counterB+=1;
                } else  {
                    counterA+=1;
                }
            }
        }
        return counterA == counterB;
    }
}
