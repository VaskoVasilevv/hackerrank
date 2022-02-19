package preparationArrNewYearChaos;

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
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int count = 0;

        //always keep track of min three vlaues observed
        //Compare currently seeing value with this three values.
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        int first = Integer.MAX_VALUE;

        //iterating from left to right
        for (int i = q.size() - 1; i >= 0; i--) {
            //person has no way to move more than two positions -> wrong
            if ((q.get(i) - i) > 3) {
                System.out.println("Too chaotic");
                return;
            } else {
                //means current value has passed at least 3 values -> wrong
                if (q.get(i) > third) {
                    System.out.println("Too chaotic");
                    return;
                } else if (q.get(i) > second) { //means -> current value has bribed 2 ppl
                    count = count + 2;
                } else if (q.get(i) > first) { //means-> current value has bribed 1 person.
                    count = count + 1;
                }

                //Now adjust minThree values comparing, taking the current vlaue to account
                if (q.get(i) < first) {
                    third = second;
                    second = first;
                    first = q.get(i);
                } else if (q.get(i) < second) {
                    third = second;
                    second = q.get(i);
                } else if (q.get(i) < third) {
                    third = q.get(i);
                }
            }
        }
        System.out.println(count);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

