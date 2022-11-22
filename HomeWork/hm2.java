package HomeWork;
import java.util.Scanner;
public class hm2 {

	public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("input your word: ");
        String iWord = iScanner.nextLine();
        boolean isPalindrome = isPalindrome(iWord);
        System.out.println("Is " + iWord + " palindrome? " + isPalindrome);
	}

	private static boolean isPalindrome(String input) {
		int right = 0;
		int left = input.length() - 1;
		while (right <= left) {
			if (input.charAt(right) != input.charAt(left)) {
				return false;
			}
			right++;
			left--;
		}

		return true;
	}

}


    