package regex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

}

class MyRegex {
    String regEx = "([0-2]([0-5]{2}|[0-4][0-9])|[0-9]{1,2})";
    public String pattern = String.format("%s.%s.%s.%s", regEx, regEx, regEx, regEx);
}
