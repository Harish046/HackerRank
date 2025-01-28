package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

public class BreakingTheRecords {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = breakingRecords(scores);
        
        System.out.println(result);

        bufferedReader.close();
    }
	
	public static List<Integer> breakingRecords(List<Integer> scores) {
	    // Write your code here
		List<Integer> result = new ArrayList<Integer>();
		int min = scores.get(0), max = scores.get(0);
		int minCount=0,maxCount=0;
		for(int i=1; i<scores.size();i++) {
			
			if(scores.get(i) < min) {
				min = scores.get(i);
				minCount++;
			}
			
			if(scores.get(i) > max) {
				max = scores.get(i);
				maxCount++;
			}

		}
		result.add(maxCount);
		result.add(minCount);
		return result;
	}

}
