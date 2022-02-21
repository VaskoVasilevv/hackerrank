package StringsCamelCase;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        // Write your code here
        int words = 1;
        if (s.length() == 0){
            words = 0;
        }
        String s1 = s.replaceAll("[A-Z]", "1");
        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(i) == '1'){
                words ++;
            }
        }


        return words;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int result = Result.camelcase(s);

        System.out.println(result);
    }
}

