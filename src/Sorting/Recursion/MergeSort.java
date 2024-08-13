package Sorting.Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,13,4,1,3,6,28};
        mergeSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if ( l >= r) {
            return;
        }
        int mid = (l+r)/2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l,mid,  r);
    }


    public static void merge(int[] arr, int l,int m,  int r) {
        int len1= m - l  + 1;
        int len2 = r - m;

        int[] leftArr = new int[len1];
        int[] rightArr = new int[len2];

        for (int i = 0; i <= len1 - 1; i++) {
            leftArr[i] = arr[l + i];
        }

        for (int i = 0; i <= len2 - 1; i++) {
            rightArr[i] = arr[m + 1 + i];
        }

        int ptrA = 0, ptrB = 0 , ptrC = l;
        while (ptrA < len1 && ptrB < len2) {
            if(leftArr[ptrA] < rightArr[ptrB]) {
                arr[ptrC] = leftArr[ptrA];
                ptrA+=1;
            } else {
                arr[ptrC] = rightArr[ptrB];
                ptrB += 1;
            }
            ptrC += 1;
        }

        while(ptrA < len1) {
            arr[ptrC] = leftArr[ptrA];
            ptrA+=1;
            ptrC+=1;
        }

        while(ptrC < len2) {
            arr[ptrC] = rightArr[ptrB];
            ptrB+=1;
            ptrC+=1;
        }


    }
}
