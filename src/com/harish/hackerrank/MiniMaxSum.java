package com.harish.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class MiniMaxSum {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();

	}

}

class Result {

    public static void miniMaxSum(List<Integer> arr) {
    	long sum=0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) > max)
                max = arr.get(i);
            if(arr.get(i) < min)
                min = arr.get(i);
            sum += arr.get(i);
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
}