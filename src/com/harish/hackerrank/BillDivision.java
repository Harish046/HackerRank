package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class BillDivision {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
	
	public static void bonAppetit(List<Integer> bill, int k, int b) {
		// Write your code here
		int total = IntStream.range(0, bill.size()).map(i -> bill.get(i)).sum();
		//int total = bill.stream().reduce(0, (i,j) -> i+j);
		total = total - bill.get(k);
		int share = total/2;
		int excess = b - share;
		if(excess > 0) 
			System.out.println(excess);
		else
			System.out.println("Bon Appetit");
	}

}
