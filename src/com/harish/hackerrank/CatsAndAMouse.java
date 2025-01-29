package com.harish.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class CatsAndAMouse {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            
            System.out.println(result);

        }
        scanner.close();
    }
    
    static String catAndMouse(int x, int y, int z) {
        
        int catA,catB;
        if(z>x)
            catA = z-x;
        else
            catA = x-z;
            
        if(z>y)
            catB = z-y;
        else
            catB = y-z;
            
        if(catA==catB)
            return "Mouse C";
            
        return (catA < catB)?"Cat A":"Cat B";

    }

}
