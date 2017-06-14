package oj;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/20.
 */

public class cs1547 {
    static Scanner cin = new Scanner(System.in);

    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {

        while (cin.hasNext()) {

            BigInteger a = cin.nextBigInteger();

            BigInteger b = cin.nextBigInteger();

            cout.println(a.add(b));

        }
        cin.close();

        cout.close();

    }
}