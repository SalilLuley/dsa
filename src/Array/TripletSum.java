package Array;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int num = 12;
        System.out.println(tripletSum(arr, num));
    }

    public static int tripletSum(int[] arr, int num) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j]+arr[k] == num) {
                        System.out.println(arr[i] + " " + arr[j]+ " " +arr[k]);
                        counter++;
                    }
                }
            }
        }
        return  counter;
    }
}
