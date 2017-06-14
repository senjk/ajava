package oj;

import java.util.Scanner;

public class c1004 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[4];
    for(int i=0;i<4;i++){
    	a[i]=sc.nextInt();
    }
    f(a[0],a[1],a[2]);
    f(a[0],a[1],a[3]);
    f(a[0],a[2],a[3]);
    f(a[1],a[2],a[3]);
    sc.close();
 }
 
 private static void f(int a, int b, int c) {
     int d[]=new int[3];
     d[0]=a;
     d[1]=b;
     d[2]=c;
     for(int i=0;i<3;i++){
    	 for(int j=0;j<3;j++){
    		 if(d[i]==d[j]) continue;
    		 for(int k=0;k<3;k++){
    			 if(d[i]==d[k]||d[j]==d[k]) continue;
    			 System.out.println(d[i]+" "+d[j]+" "+d[k]);
    		 }
    	 }
     }
 }
}
