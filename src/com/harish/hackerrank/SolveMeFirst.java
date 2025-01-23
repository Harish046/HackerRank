package com.harish.hackerrank;

import java.util.Scanner;

public class SolveMeFirst {

	public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
	
	static int solveMeFirst(int a, int b) throws Exception {
		 if(a>=1 && a <=1000 && b>=1 && b <=1000)
	            return a+b;
	        else
	            throw new Exception("Failed Constraint input should be between 1-1000");

   }

}
