package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class PlusMinus {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }
	
	public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	        int pos=0,neg=0,zero=0;
	        
	        for (Integer integer : arr) {
	            if(integer==0)
	                zero++;
	            if(integer<0)
	                neg++;
	            if(integer>0)
	                pos++;
	        }
	        
	        System.out.println(String.format("%.6f",(double)pos/arr.size()));
	        System.out.println(String.format("%.6f",(double)neg/arr.size()));
	        System.out.println(String.format("%.6f",(double)zero/arr.size()));

	    }
}
