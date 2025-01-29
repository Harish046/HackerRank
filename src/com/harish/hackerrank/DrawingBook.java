package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingBook {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = pageCount(n, p);

        System.out.println(result);
        bufferedReader.close();
    }
	
	public static int pageCount(int n, int p) {
		
		if(p == 1 || p == n )
			return 0;
		
		boolean odd = n % 2 != 0;
		if(odd && (n-p == 1))
			return 0;
		
		int left = 2;
		int leftCounter = 1;
		while(left !=p) {
			if(left+1 != p) {
				left+=2;
				leftCounter++;
			} else {
				left++;
				break;
			}
		}
		
		int right=n-1;
		int rightCounter = (odd)?0:1;
		while(right != p) {
			if(odd) {
				if(right-1 != p) {
					right-=2;
					rightCounter++;
				} else {
					right--;
					rightCounter++;
					break;
				}
			}else {
				if(right-1 != p) {
					right-=2;
					rightCounter++;
				} else {
					right--;
					break;
				}
			}
		}
		
		return leftCounter>rightCounter?rightCounter:leftCounter;
	}

}
