package Recursion;

public class GeometricSum {
    public static void main(String[] args) {
        double result = findGeometricSum(3);
        System.out.println(result);
    }

    public static double findGeometricSum(int k){
        return findGeometricSum(k, 1, 1);
    }

    public static double findGeometricSum(int k, int power, double sum){
        if (power > k) {
            return sum;
        }
        return findGeometricSum(k, power+1, sum + 1 / Math.pow(2, power));
    }
}
