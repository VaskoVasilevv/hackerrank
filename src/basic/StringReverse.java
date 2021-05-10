package basic;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        char[] chars = A.toCharArray();
        boolean isComplete = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                isComplete = false;
                break;
            }

        }
        if (isComplete) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        StringBuilder sb = new StringBuilder(A);
        sb.reverse();

        if (A.equals(sb.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
