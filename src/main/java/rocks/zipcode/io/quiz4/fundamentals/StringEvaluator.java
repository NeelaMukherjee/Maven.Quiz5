package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                result.add(string.substring(i, j));

            }
        }

        List<String> listDistinct = result.stream().distinct().collect(Collectors.toList());

        return listDistinct.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        String[] commonStr1 = getAllSubstrings(string1);
        String[] commonStr2 = getAllSubstrings(string2);

        ArrayList<String> cs1 = new ArrayList<>(Arrays.asList(commonStr1));
        ArrayList<String> cs2 = new ArrayList<>(Arrays.asList(commonStr2));

        List<String> result = new ArrayList<>();

        for (int i = 0; i < commonStr1.length; i++) {

            if (cs2.contains(commonStr1[i])) {

                result.add(commonStr1[i]);
            }
        }
        return result.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        String[] cmSubStr = getCommonSubstrings(string1, string2);

        Integer maxLength= 0;

        String longestString = null;
        for (String s : cmSubStr) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;

    }
}
