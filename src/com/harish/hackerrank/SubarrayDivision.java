package com.harish.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SubarrayDivision {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = birthday(s, d, m);

        System.out.println(result);
        bufferedReader.close();
    }
	
	public static int birthday(List<Integer> s, int d, int m) {
	    // Write your code here
		if (m > s.size()) 
			return 0;

		int sum=0;
		for(int i=0;i<m;i++)
			sum+=s.get(i);
		
		int result = 0;
		for (int i = 0; i + m <= s.size(); i++) {
			if (sum == d) 
				result++;
			
			if (i + m < s.size()) 
				sum = sum + s.get(i + m) - s.get(i);
		}
		return result;
		
	}

}
