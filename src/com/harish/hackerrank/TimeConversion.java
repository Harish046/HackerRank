package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
	public static String timeConversion(String s) {
		String format = s.substring(s.length()-2, s.length());
		int hours = Integer.parseInt(s.substring(0, 2));
		String time = s.substring(2,s.length()-2);
		if(format.toUpperCase().equals("AM")) {
			if(hours < 12)
				time = "0"+hours+time;
			else if(hours == 12)
				time = "00"+time;
		} else {
			if(hours < 12) 
				hours += 12;
			time = hours +time;
		}
	    return time;
	}

}
