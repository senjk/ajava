package oj;

import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1727 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            String a[] = cin.nextLine().trim().replaceAll("[.,]", "").toUpperCase().split("\\s+");
            LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
            for (String s: a)
                if (map.containsKey(s))
                    map.put(s, map.get(s)+1);
                else {
                    map.put(s, 1);
                }
            for (String s: map.keySet()) {
                System.out.println(s+":"+count(map.get(s))+map.get(s));
            }
        }

        cin.close();
        cout.close();
    }

    private static String count(int n) {
        String s = "";
        for (int i=0; i<n; i++)
            s += "*";
        return s;
    }
}
