package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1604 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        String str1 = cin.next();
        String str2 = cin.next();
        if (str1.length() == str2.length()) {
            if (str1.equals(str2))
                System.out.println("2");
            else {
                if (str1.toLowerCase().equals(str2.toLowerCase()))
                    System.out.println("3");
                else
                    System.out.println("4");
            }
        } else
            System.out.println("1");

        cin.close();
        cout.close();
    }
}
