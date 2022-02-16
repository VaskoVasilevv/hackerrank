package preparationDateTime;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        int n=s.length();
        String ss=s.substring(2,n-2);
        String sk="";
        if(s.charAt(n-2)=='A') {
            if(Integer.valueOf(s.substring(0,2))>=12) {
                sk="00"+ss;
            }
            else {
                int n1=Integer.valueOf(s.substring(0,2));
                sk="0"+n1+ss;
            }
        }
        else if(s.charAt(n-2)=='P') {
            if(Integer.valueOf(s.substring(0,2))==12) {
                sk="12"+ss;
            }
            else {
                int n2=Integer.valueOf(s.substring(0,2));
                n2=n2+12;
                sk=n2+ss;
            }
        }
        return sk;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

