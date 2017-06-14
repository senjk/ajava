package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1138 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            String s = cin.next().replaceAll("0","0").replaceAll("1","1").replaceAll("[a-c]", "2").replaceAll("[d-f]", "3").replaceAll("[g-i]", "4")
                    .replaceAll("[j-l]", "5").replaceAll("[m-o]", "6").replaceAll("[p-s]", "7").replaceAll("[t-v]", "8")
                    .replaceAll("[w-z]", "9").replaceAll("[Z]", "a");
            char[] a = s.toCharArray();
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= 'A' && a[i] < 'Z')
                    a[i] = (char) (a[i] + 'a' - 'A' + 1);
            }
            System.out.println(new String(a));
        }

        cin.close();
        cout.close();
    }
}
