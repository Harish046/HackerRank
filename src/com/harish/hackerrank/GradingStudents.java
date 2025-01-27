package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

public class GradingStudents {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
		List<Integer> result = new ArrayList<Integer>();
		for (int grade: grades) {
			if(grade < 38) {
				result.add(grade);
				continue;
			}
			int reminder = grade % 5;
			if(reminder >=  3 && reminder != 0)
				result.add(grade+(5-reminder));
			else 
				result.add(grade);
				
		}
		return result;
	}

}
