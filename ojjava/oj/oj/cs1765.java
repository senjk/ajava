package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1765 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int N = cin.nextInt(), M = cin.nextInt();
            N = (N+1) / M;
            System.out.println((1<<N)-1);
        }
        cin.close();
        cout.close();
    }
}
