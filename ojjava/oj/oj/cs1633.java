package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1633 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
            System.out.println(lcm(lcm(a, b), c));
        }
        cin.close();
        cout.close();
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
