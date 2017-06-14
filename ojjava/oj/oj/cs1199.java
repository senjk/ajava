package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1199 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int a = cin.nextInt(), b = cin.nextInt();
            if (a ==0 && b == 0) break;
            System.out.println(a + b);
        }

        cin.close();
        cout.close();
    }
}
