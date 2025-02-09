package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberLineJumps {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);
        
        bufferedReader.close();
    }
	
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    // Write your code here
		if( (v1 < 1 || v1 > 10000) && (v2 < 1 || v2 > 10000))
			return "NO";
		
		if(!(0 <= x1 && x1 < x2 && x2 <= 10000))
			return "NO";
		
		for(int i=0;i<10000;i++)
	    {
				x1 = x1 + v1;
				x2 = x2 + v2;
				if(x1 == x2)
					return "YES";
		}
		return "NO";	
	}
}
