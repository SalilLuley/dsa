package Array;

public class StringCheck {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "aeb";

        Boolean result = checkSequence(a, b);
        System.out.println(result);
    }

    public static boolean checkSequence(String a, String b) {
        int[] indexOfBChars = new int[b.length()];

        for (int i = 0; i < b.length(); i++) {
            if (i == 0 ) {
                int index = a.indexOf(b.charAt(i));
                indexOfBChars[i] = index;

            } else {
                int index = a.indexOf(b.charAt(i));
                if (index == -1){
                    return  false;
                }
                if (index < indexOfBChars[i-1]) {
                    a = a.substring(0, index)+'0'+ a.substring(index+1);
                    i--;
                } else {
                    indexOfBChars[i] = index;
                }
            }

        }
        return true;
    }
}
