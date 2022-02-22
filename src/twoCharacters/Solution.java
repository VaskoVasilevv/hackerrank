package twoCharacters;

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
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
        // Write your code here

        HashSet<Character> characterHashSet = new HashSet<Character>();
        List<Character> chars = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++)
            characterHashSet.add(s.charAt(i));

        for (Character i : characterHashSet)
            chars.add(i);

        int n = chars.size(), max = 0, k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String temp = "[^" + chars.get(i) + chars.get(j) + "]";
                String f = s.replaceAll(temp, "");

                for (k = 0; k < f.length() - 1; k++) {
                    if (f.charAt(k) == f.charAt(k + 1))
                        break;
                }

                if (k == f.length() - 1)
                    max = Math.max(f.length(), max);
            }
        }
        return max;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

