package com.harish.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ElectronicsShop {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] bnm = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println(moneySpent);
        scanner.close();
    }
    
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    	
    	int currentcost=0;
    	int maximunCost=0;
    	for(int i=0;i<keyboards.length;i++) {

    		for(int j=0;j<drives.length;j++) {
    			if(b - (keyboards[i] + drives[j]) >= 0 ) {
    				currentcost = keyboards[i] + drives[j];
    				if(currentcost >= maximunCost && currentcost <= b) {
    					maximunCost = currentcost;
    				}
    			}
    		}
    	}
    	if(maximunCost==0) 
    		return -1;
    	return maximunCost;
    }

}
