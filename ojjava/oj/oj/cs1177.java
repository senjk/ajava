package oj;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/20.
 */
public class cs1177 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {

            int n = cin.nextInt();
            BigInteger ret = new BigInteger("1");

            for (int i = 2; i <= n; i++) {

                BigInteger cur = new BigInteger(Integer.toString(i));//""+i
                ret = ret.multiply(cur);

            }
            cout.println(ret);
        }
        cin.close();
        cout.close();
    }

}
