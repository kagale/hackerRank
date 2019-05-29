import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        boolean isNumberPrime = false;
        while(T-->0) {
            int number = scan.nextInt();
            System.out.println(isPrimeOptimized(number) ? "Prime" : "Not prime");
        }
        scan.close();
    }
    
    public static boolean isPrime(int number) {
        if(number > 1) {
            for(int i=2; i<number; i++) {
                if(number%i==0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean isPrimeOptimized(int number) {
        if(number > 1) {
            int sqrt = (int) Math.sqrt(number);
            for(int i=2; i<=sqrt; i++) {
                if(number%i==0) {
                    return false;
                } 
            }
            return true;
        }
        return false;
    }
}