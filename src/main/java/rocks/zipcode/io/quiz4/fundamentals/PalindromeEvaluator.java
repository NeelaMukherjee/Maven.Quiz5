package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        String [] subStrings = StringEvaluator.getAllSubstrings(string);

        List<String> result = new ArrayList<>();

        for(int i=0;i<subStrings.length; i++){

            if(isPalindrome(subStrings[i])){

                result.add(subStrings[i]);
            }

        }

        return result.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        String b = reverseString(string);
        Boolean bool= false;

        if(string.equals(b))
        {
            bool= true;
        }

        return bool;
    }

    public static String reverseString(String string) {

        String b = "";

        int length = string.length();
        for(int i = length - 1; i >= 0; i--)
        {
            b = b + string.charAt(i);
        }

        return b;
    }
}
