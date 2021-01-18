package com.hackerrank.practice.array;

import com.hackerrank.practice.Challenge;
import org.apache.log4j.Logger;


/**
 * hackerrank challenge link: https://www.hackerrank.com/challenges/java-2d-array/problem
 */
public class Java2DArray implements Challenge {
    private static final Logger LOGGER = Logger.getLogger(Java2DArray.class);
    public void solution() {

        int [][] arr = new int[6][6];

        // fill up the 2D array with zeros
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                arr[j][i] = 0;
            }
        }

        // the following were sample input;
        /*
        int x = 0, y= 0;
        final int ONE = 1;
        final int TWO = 2;

        arr[x][y] = ONE;
        arr[x][y+1] = ONE;
        arr[x][y+2] = ONE;

        arr[x+1][y+1] = ONE;

        arr[x+2][y] = ONE;
        arr[x+2][y+1] = ONE;
        arr[x+2][y+2] = ONE;

        x = 3; y=2;
        arr[x][y-1]=9;
        arr[x][y] = TWO;
        arr[x][y+1] = -4;
        arr[x][y+2] = -4;

        arr[x+1][y+1] = -2;

        arr[x+2][y] = -1;
        arr[x+2][y+1] = -2;
        arr[x+2][y+2] = -4;
        */

        // We have to set the lowest possible value so that
        // high variable will be updated especially for non-positive result.
        int high = -100;

        for (int j = 0; j < arr.length-2; j++) {
            for (int i = 0; i < arr[j].length-2; i++) {
                int sum = 0;
                sum += arr[j][i];
                sum += arr[j][i + 1];
                sum += arr[j][i + 2];

                sum += arr[j + 1][i + 1];

                sum += arr[j + 2][i];
                sum += arr[j + 2][i + 1];
                sum += arr[j + 2][i + 2];

                if(sum > high){
                    high = sum;
                }
            }
        }
        System.out.println(high);

        // Display the 2D array values:
        /*for (int j = 0; j < 6; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                System.out.print(arr[j][k]);
            }
            System.out.println();
        }*/
    }
}
