package oj;

import java.util.Scanner;

public class c1328 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()){
			char[] str=sc.nextLine().toLowerCase().toCharArray();
			if(str[0]>='a'&&str[0]<='z')
				str[0]=(char)((int)str[0]-32);
			System.out.println(new String(str));
		}
		sc.close();
	}
}
