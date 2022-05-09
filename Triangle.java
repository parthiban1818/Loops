package Loops;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           for(int i=1;i<=n;i++) {
        	   for(int j=i;j<=n;j++) {
        		   System.out.print(" ");
        	   }
        	   for(int j=1;j<i;j++) {
        		   if(j==1|i==n)
        		   System.out.print("*");
        		   else
        			   System.out.print(" ");
        	   }
        	   for(int j=1;j<=i;j++) {
        		   if(i==j|i==n)
        		   System.out.print("*");
        		   else
        			   System.out.print(" ");
        	   }
        	   System.out.println();
           }
	}

}
