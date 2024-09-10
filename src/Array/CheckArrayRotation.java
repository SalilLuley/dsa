package Array;

public class CheckArrayRotation {
    public static void main(String[] args) {
        int[] arr = new int[] {6,7,3,4,5,1,2};
        int result = arrayRotateCheck(arr);
        System.out.println(result);
    }

    public static int arrayRotateCheck(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                counter = i+1;
                break;
            }
        }
        return  counter;
    }
}
