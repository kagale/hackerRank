import java.util.*;

class Solution{
   
   public static void main(String[] args) {
       HashMap<Character, Character> charMap = new HashMap<>();
       charMap.put('(', ')');
       charMap.put('{', '}');
       charMap.put('[', ']');
       
       Scanner sc = new Scanner(System.in);
       while (sc.hasNext()) {
           String input=sc.next();
           System.out.println(whetherBalanced(input, charMap) ? true : false);
       }
       sc.close();
   }
    
    private static boolean whetherBalanced(String input, Map<Character, Character> charMap) {
        if (input.length()%2 != 0) {
            return false;
        }
        
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for(int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if (charMap.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != charMap.get(deque.pop())) {
                return false;
            }
        }
        
        return deque.isEmpty();
    }
}