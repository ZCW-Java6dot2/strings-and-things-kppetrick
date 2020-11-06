package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {
    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */


    public Integer countYZ(String input) {
        int result = 0;
        String lastLetters = "";
        for (String wordsSplit : input.split(" ")) {
            Character lastChar = wordsSplit.charAt(wordsSplit.length() - 1);
            if (lastChar.equals('y') || lastChar.equals('z')) {
                result += 1;
            }
        }
        return result;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String altered = base;
        altered = base.replace(remove, "");
        return altered;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        String is = input;
        String not = input;
        Integer isCount = 0;
        Integer notCount = 0;

        for (int i = 0; i <= is.length(); i++) {
            Integer x = is.indexOf("is");
            if (x != -1) {
                is = is.substring(x + 2);
                isCount++;
            }
        }
        for (int i = 0; i <= not.length(); i++) {
            Integer y = not.indexOf("not");
            if (y != -1) {
                not = not.substring(y + 3);
                notCount++;
            }
        }
        if (isCount == notCount) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'g') {
                if (input.charAt(i - 1) == 'g' || input.charAt(i + 1) == 'g') {
                    continue;
                }
                return false;
            }
        }
        return true;
    }



    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        Integer length = input.length();
        Integer count = 0;

        if(input.length() >= 3) {
            for (int i = 0; i <= length - 3; i++){
                String first = input.substring(i, i+1);
                String second = input.substring(i +1, i +2);
                String third = input.substring(i + 2, i +3);
                if(second.equals(first) && third.equals(first)) {
                    count++;
                }
            }
        }
        return count;
    }
}
