package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1027 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
            int abcd ,ab, cd;
            for (abcd = 1000; abcd < 9999; abcd++) {
                ab = abcd / 100;
                cd = abcd % 100;
                if (abcd == (ab + cd) * (ab + cd))
                    System.out.println(abcd);
            }
            cin.close();
            cout.close();

    }
}

