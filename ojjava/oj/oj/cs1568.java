package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1568 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println(solve(n));
        }

        cin.close();
        cout.close();
    }
    private static int solve(int n) {
        if (n < 2) return 1;
        if (n == 2) return 3;
        int t =2;
        int p = 1, q = 1, s = 2;
        while (s < n) {
            s = p  + q;
            p = q;
            q = s;
            t++;
        }
        return t;
    }
}
