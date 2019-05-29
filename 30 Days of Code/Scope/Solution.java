import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
	Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        /*for(int i=0; i<elements.length-1; i++) {
            for(int j=0; j<elements.length; j++) {
                maximumDifference = Math.max(maximumDifference, Math.abs(elements[i] - elements[j]));
            }
        }*/
        int max = Arrays.stream(elements).max().getAsInt();
        int min = Arrays.stream(elements).min().getAsInt();
        maximumDifference = Math.abs(max - min);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
