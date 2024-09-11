package Array;

public class MaximumProfitOnApp {
    public static void main(String[] args) {
        int[] arr = new int[]{34,78,90,15,67};
        System.out.println(maximumProfit(arr));
    }

//    public static int maximumProfit(int[] budget) {
//        int[] result = bubbleSort(budget);
//        int mid = result.length/2 ;
//        int newDiff = mid;
//        while(result[mid] == result[mid-1]) {
//            newDiff += 1;
//            mid -= 1;
//        }
//        return result[mid] * newDiff;
//    }
//
    public static void bubbleSort(int[] budget) {
        for (int i = 0; i < budget.length; i++) {
            for (int j = 0; j < budget.length; j++) {
                if (budget[i] < budget[j]) {
                    int temp = budget[i];
                    budget[i] = budget[j];
                    budget[j] = temp;
                }
            }
        }
    }

    public static int maximumProfit(int budget[]) {
        bubbleSort(budget);
        int ans=Integer.MIN_VALUE;
        int n=budget.length;
        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,budget[i]*(n-i));
        }
        return ans;
    }
}
