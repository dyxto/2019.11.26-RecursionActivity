
import java.util.ArrayList;
import java.util.Stack;

public class RecursionActivity {
	
	public static void main(String[] args) {
		
//		System.out.println(countVowels("pro gamer move"));
//		System.out.println(multiplyEvens(2));
		System.out.println(isPalindrome("tacocat"));
		System.out.println(isPalindrome("palindrome"));
		System.out.println(isPalindrome("noon"));
		System.out.println(isPalindrome("TWICE"));
		
//		String evenWord = "noon";
//		isPalindrome(evenWord);
//		System.out.println(evenWord + " is a palindrome: " + isPalindrome("noon"));
		

	}//main

	private static String countVowels(String word) { // is iteration not recursion
		
		//char[] letters = word.toCharArray();
		if (word.length() == 0) {
			
		}
		
		int count = 0;
		//base-case: 0 vowels
		
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
				count++;
			}	
		}
		return count + " vowels";
	}//countVowels

	private static int multiplyEvens(int n) { // not done have no clu
		
		if (n<=1)
			return 2;
		else{
			return n*2 * multiplyEvens(n-1);
		}
	}//multiplyEvens
	
	private static boolean isPalindrome(String string) {
        Stack<Character> stack = new Stack<Character>();
        char[] ch = string.toCharArray();
	for (int i = 0; i < string.length(); i++) {
              stack.push(ch[i]);
        }
	String reversed = "";
       while (!stack.isEmpty()) {
              reversed += stack.pop();
       }
       System.out.println("string: " + string + "\nreversed: " + reversed);
       if (string.equals(reversed)) {
		 return true;}
        else {
              return false;}
}//isPalindrome
	
//	private static boolean isPalindrome(String word) {
//
//	     if (word.length() == 0 || word.length() == 1) 
//
//	          return true;
//
//	     if (word.charAt(0) == word.charAt(word.length()-1))
//
//	          return isPalindrome(word.substring(1,word.length()-1));
//
//	     return false;
//
//	}

}
