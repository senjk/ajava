package oj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 程森 on 2017/5/29.
 */
public class cs1778 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chs = br.readLine().toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < chs.length; i++) {
            list.add(chs[i]);

        }
        String s = "";
        for (int i = 0; i < func(list).size(); i++) {
            s += list.get(i);
        }
        System.out.println(s);

        cin.close();
        cout.close();
    }

    private static List<Character>func(List<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '+' || list.get(i) == '-') {
                if (list.get(i - 1) == ')' && list.get(i + 1) == '(') {
                    list.remove(i - 1);
                    list.remove(i);
                    for (int j = i - 1; j > -1; j--) {
                        if (list.get(j) == '(') {
                            list.remove(j);
                            break;
                        }
                    }
                    for (int k = i+1; k < list.size(); k++) {
                        if (list.get(k) == ')') {
                            list.remove(k);
                            break;
                        }
                    }
                }
                if (list.get(i - 1) == ')') {
                    list.remove(i - 1);
                    for (int j = i - 1; j > -1; j--) {
                        if (list.get(j) == '(') {
                            list.remove(j);
                            break;
                        }
                    }
                }
                if (list.get(i + 1) == '(') {
                    if (list.get(i) == '+')
                        for (int k = i + 1; k < list.size(); k++) {
                            if (list.get(k) == ')' && !list.contains('/')
                                    && !list.contains('*')) {
                                list.remove(k);
                                list.remove(i + 1);
                                break;
                            }
                        }
                }
            }
        }
        return list;
    }

    }

