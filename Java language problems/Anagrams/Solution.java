import java.util.Scanner;

public class Solution {
	
	static boolean isAnagram(String a, String b) {
        char[] str1 = a.toLowerCase().toCharArray();
        char[] str2 = b.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}