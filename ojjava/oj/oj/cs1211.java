package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1211 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        int t  = cin.nextInt();
        while (t-- > 0) {
            int n = cin.nextInt();
            toBit(n);
        }

        cin.close();
        cout.close();
    }
    private static void toBit(int n) {
        String bit = Integer.toBinaryString(n);
        String zeros = f(32 - bit.length());
        System.out.println(zeros+bit);
    }
    private static String f(int n) {
        String s = "";
        while (n-- > 0)
            s += "0";
        return s;
    }

}
