package oj;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1260 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            String s = cin.nextLine();
            String p = cin.nextLine();
            Pattern pattern = Pattern.compile(p);
            Matcher matcher = pattern.matcher(s);
            int cnt = 0;
            while (matcher.find())
                cnt++;
            System.out.println(cnt);
        }

        cin.close();
        cout.close();
    }
}
