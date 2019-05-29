import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int hourglass;
        int maxSumOfHourGlass = 0;
        
        int i = 0;
        int j = 0;
        while(i<4) {
            hourglass = arr[i][j] + arr[i][j+1] + arr[i][j+2];
            hourglass += arr[i+1][j+1];
            hourglass += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            
            if(i==0 && j==0) {
                maxSumOfHourGlass = hourglass;
            }
            j++;
            if(j>3) {
                j = 0;
                i++;
            }
            
            maxSumOfHourGlass = Math.max(maxSumOfHourGlass, hourglass);
        }
        
        System.out.println(maxSumOfHourGlass);
    }
}
