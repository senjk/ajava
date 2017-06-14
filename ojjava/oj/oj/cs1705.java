package oj;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1705 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        int t = cin.nextInt();
        while (t-- > 0) {
            int n = cin.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = cin.nextInt();
            for (int i = 0; i < n; i++)
                b[i] = cin.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i] * b[n - i - 1];
            }
            System.out.println(sum);

        }

        cin.close();
        cout.close();
    }
}
