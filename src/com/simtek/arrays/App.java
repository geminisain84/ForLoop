package com.simtek.arrays;

public class App {

	
	

	public static void main(String[] args) {
		int[] intArr = new int[4];
        intArr[0] = 101;
        intArr[1] = 153;
        intArr[2] = 107;
        intArr[3] = 109;
        
        
        System.out.println("len = " + intArr.length);
        
        //find the average of the array
        int sum = 0;
        for (int i=0; i<intArr.length; i++) {
        	sum = sum + intArr[i];
        }
		
	}

}