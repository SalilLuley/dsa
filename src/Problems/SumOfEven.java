package Problems;
import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEven {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 8, 3, 9, 15));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(1, 4)));
        B.add(new ArrayList<>(Arrays.asList(0,2)));
        B.add(new ArrayList<>(Arrays.asList(2,3)));

        System.out.println(sumOfEvenIndexedElements(A, B));
    }

     public static ArrayList<Integer> sumOfEvenIndexedElements(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            if (B.size() < 1) {
                return al;
            }

            for (int i=0; i< B.size(); i++) {
                ArrayList<Integer> lst = (ArrayList<Integer>) B.get(i);
                int count = 0;
                for (int j=lst.get(0); j <= lst.get(lst.size()-1); j++){
                    if (j % 2 == 0) {
                        count += A.get(j);
                    }
                }
                al.add(count);
            }
        return al;
    }
}