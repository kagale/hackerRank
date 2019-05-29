import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        System.out.println(consecutiveOnes(num));
    }
    
    public static int consecutiveOnes(int n) {
        int count = 0;
        int max   = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
            n = n >> 1;
        }
        return max;
    }
}