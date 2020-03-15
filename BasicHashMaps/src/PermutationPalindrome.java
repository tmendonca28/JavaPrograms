import java.util.HashSet;
import java.util.Set;

public class PermutationPalindrome {
    public static void main(String[] args) {
        /*
        Write an efficient method that checks whether any permutation ↴ of an input string is a palindrome. ↴
        You can assume the input string only contains lowercase letters.
        Examples:
    "civic" should return true
    "ivicc" should return true
    "civil" should return false
    "livci" should return false
        */
        System.out.println(isPalindromePermutation("civic"));
        System.out.println(isPalindromePermutation("ivicc"));
        System.out.println(isPalindromePermutation("civil"));
        System.out.println(isPalindromePermutation("lvici"));
    }

    public static boolean isPalindromePermutation(String input) {
        Set<Character> unpairedCharacters = new HashSet<>();

        for (char c : input.toCharArray()) {
            if(unpairedCharacters.contains(c)) {
                unpairedCharacters.remove(c);
            } else {
                unpairedCharacters.add(c);
            }
        }
        return unpairedCharacters.size() <= 1;
    }

}
