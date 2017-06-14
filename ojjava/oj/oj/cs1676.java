package oj;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1676 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while (cin.hasNext()) {
            int n = cin.nextInt();
            int a[] = new int[n];
            for (int i=0; i<n; i++)
                a[i] = cin.nextInt();
            Arrays.sort(a);
            for (int i=n-1; i>n-10-1; i--) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }

        cin.close();
        cout.close();
    }
}
