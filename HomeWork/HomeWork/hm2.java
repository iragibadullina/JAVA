package HomeWork;
import java.util.Scanner;
public class hm2 {


public static boolean main(char[] word){
    // Scanner iScanner = new Scanner(System.in);   
    // System.out.print("Please enter your word: ");
    // int n = iScanner.nextInt();
    int i1 = 0;
    int i2 = word.length - 1;
    while (i2 > i1) {
        if (word[i1] != word[i2]) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
    }
}



    