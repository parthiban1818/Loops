package Loops;

import java.util.Scanner;

public class Invert {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=1;i<=n;i++) {
        	 for(int j=1;j<=i;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=i;j<=n;j++) {
        		 if(i==1|j==n|j==i)
        		 System.out.print("* ");
        		 else
        			 System.out.print("  ");
        	 }
        	 System.out.println();
         }
         
	}

}
