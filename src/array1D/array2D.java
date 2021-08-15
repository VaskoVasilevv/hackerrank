package array1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) throws IOException {


        int[][] arr = new int[10][10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int maxi = -100000;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i <= 3 && j <= 3) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + (arr[i + 1][j + 1]) + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (sum > maxi) maxi = sum;
                }
            }
        }
        System.out.println(maxi);

    }
}