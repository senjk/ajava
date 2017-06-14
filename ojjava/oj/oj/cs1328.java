package oj;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1328 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        while(cin.hasNext()){
            char[] str=cin.nextLine().toLowerCase().toCharArray();
            if(str[0]>='a'&&str[0]<='z')
                str[0]=(char)((int)str[0]-32);
            System.out.println(new String(str));
        }

        cin.close();
        cout.close();
    }
}
