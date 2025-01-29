package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class SalesByMatch {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = sockMerchant(n, ar);

        System.out.println(result);
        bufferedReader.close();
    }
	
	public static int sockMerchant(int n, List<Integer> ar) {
		if(n > 100 && n < 1) {
			return 0;
		}
		
		long count = ar.stream()
				.collect(Collectors.groupingBy(Function.identity(), 
						Collectors.counting()))
				.entrySet()
				.stream()
				.map(map -> map.getValue()/2)
				.filter(p -> p > 0)
				.mapToLong(Long::valueOf).sum();
		
		return (int)count;
	}

}
