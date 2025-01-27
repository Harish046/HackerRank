package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }
	
	public static void staircase(int n) {
		// Write your code here
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				if(i+j < n-1) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}

			}
			System.out.println();
		}

	}

}
