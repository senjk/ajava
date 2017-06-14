package oj;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1204 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t-- > 0) {
            String s = cin.nextLine();
            if (match(s)) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

        cin.close();
        cout.close();
    }
    private static boolean match(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<s.length(); i++) {
            if (isLeft(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            else if (isRight(s.charAt(i))) {
                if (stack.isEmpty())
                    return false;
                else if (stack.peek() == op(s.charAt(i)))
                    stack.pop();
                else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }

    private static Character op(char ch) {
        if (ch == ')')
            return '(';
        if (ch == '}')
            return '{';
        if (ch == ']')
            return '[';
        return null;
    }

    private static boolean isRight(char ch) {
        if (ch == ')' || ch == ']' || ch == '}' )
            return true;
        return false;
    }

    private static boolean isLeft(char ch) {
        if (ch == '(' || ch == '[' || ch == '{' )
            return true;
        return false;
    }
}
