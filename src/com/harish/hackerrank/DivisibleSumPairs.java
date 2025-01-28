package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class DivisibleSumPairs {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = divisibleSumPairs(n, k, ar);

        System.out.println(result);
        bufferedReader.close();
    }
	
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
	    // Write your code here	
		int count=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int sum = ar.get(i) + ar.get(j);
				if(sum%k == 0) {
					count++;
				}
			}
		}
		return count;
	}
}
