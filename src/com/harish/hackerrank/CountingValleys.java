package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);

        System.out.println(result);
        bufferedReader.close();
    }
	
	public static int countingValleys(int steps, String path) {
		
		int valleyCount=0;
		int counter=0;
		String[] paths = path.split("");
		for(int i=0;i<steps;i++) {
			switch(paths[i]) {
				case "D": counter++;break;
				case "U": counter--;break;
			}
			if(counter == 0 && paths[i].toUpperCase().equals("U"))
				valleyCount++;
		}
		
		return valleyCount;
	}

}
