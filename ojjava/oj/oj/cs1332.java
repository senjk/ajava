package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1332 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt();
            System.out.println(String.format("%03d", pow(a, b)));
        }

        cin.close();
        cout.close();
    }
    private static int pow(int a, int b) {
        if (b == 0 || a == 1) return 1;
        if (a == 0) return 0;
        if (b % 2 == 0) return pow(a * a % 1000, b/2) % 1000;
        else return pow(a*a%1000, b/2) *a % 1000;
    }
}
