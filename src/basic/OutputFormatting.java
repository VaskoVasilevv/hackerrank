package basic;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            StringBuilder sb = new StringBuilder(s1);
            if (s1.length() < 15) {
                for (int j = s1.length(); j < 15; j++) {
                    sb.append(" ");
                }
            }
            System.out.printf("%s%03d%n", sb, x);
        }
        System.out.println("================================");
    }
}
