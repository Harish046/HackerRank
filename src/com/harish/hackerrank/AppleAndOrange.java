package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class AppleAndOrange {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int roofTopStart = Integer.parseInt(firstMultipleInput[0]);

        int roofTopEnd = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int appleTree = Integer.parseInt(secondMultipleInput[0]);

        int orangeTree = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        countApplesAndOranges(roofTopStart, roofTopEnd, appleTree, orangeTree, apples, oranges);

        bufferedReader.close();
    }
	
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
	    // Write your code here
		int count = 0;
		for(int apple : apples) {
			if(apple > 0) {
				int applePos = a + apple;
				if(applePos < s)
					continue;
				else {
					if(applePos >= s && applePos <= t)
						count++;
				}
			}		
		}
		System.out.println(count);
		count=0;
		for(int orange: oranges) {
			int orangePos = b+orange;
			if(orangePos > t)
				continue;
			else {
				if(orangePos <= t && orangePos >= s)
					count++;
			}
		}
		System.out.println(count);
	}

}
