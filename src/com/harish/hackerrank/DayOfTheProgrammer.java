package com.harish.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

public class DayOfTheProgrammer {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        System.out.println(result);

        bufferedReader.close();
    }
	
	public static String dayOfProgrammer(int year) {
		
		if(year < 1918) {
			return (year%4==0)? "12.09."+year:"13.09."+year;
		} else if(year == 1918) {
			return "26.09."+year;
		} else {
			return (((year%4==0) && (year%100!=0)) || (year%400==0))? "12.09."+year:"13.09."+year;
		}
	}

}
