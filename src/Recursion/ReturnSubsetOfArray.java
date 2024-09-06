package Recursion;

import java.util.Arrays;

public class ReturnSubsetOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{15,20,12};
        System.out.println(Arrays.deepToString(subsets(arr)));
    }

    public  static int[][] subsets(int[] input) {
        return subsets(input, 0);
    }


    public  static int[][] subsets(int[] input, int startIndex) {
        if(startIndex == input.length) {
            int[][] output = new int[1][0];
            return output;
        }
        int[][]smallAns =  subsets(input, startIndex+1);

        int[][] result = new int[smallAns.length *2][];
        int k = 0;

        for (int i = 0; i < smallAns.length; i++) {
            result[k] = new int[smallAns[i].length];
            for (int j = 0; j < smallAns[i].length; j++) {
                result[k][j] = smallAns[k][j];
            }
            k++;
        }

        for (int i = 0; i < smallAns.length; i++) {
            result[k] = new int[smallAns[i].length+1];
            result[k][0] = input[startIndex];

            for (int j = 1 ; j < smallAns[i].length; j++) {
                result[k][j]=smallAns[i][j-1];
            }
            k++;
        }
        return result;
    }
}


