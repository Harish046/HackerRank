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

public class CompareTheTriplets {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice=0;
        int bob=0;
        for (int i=0;i<3;i++) {
            if(a.get(i) == b.get(i))
                continue;
            if(a.get(i)>b.get(i))
                alice++;
            if(b.get(i)>a.get(i))
                bob++;
                
        }
        List<Integer> result = new ArrayList<>();
        result.add(alice);
        result.add(bob);
        return result;
    }

}
