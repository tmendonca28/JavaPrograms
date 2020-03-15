import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InflightEntertainment {
    /*
    Users on longer flights like to start a second movie right when their first one ends, but they complain that the
    plane usually lands before they can see the ending. So you're building a feature for choosing two movies whose
    total runtimes will equal the exact flight length.
    Write a method that takes an integer flightLength (minutes) and an array of integers movieLengths (minutes) and
    returns a boolean whether there are two numbers in movieLengths whose sum equals flightLength.
    */
    public static void main(String[] args) {
        runtimeCheck(new int[] {4,5,6,7,8}, 10);
    }

    public static boolean runtimeCheck (int[] movieLengths, int flightLength) {
        // Create hashset to store lengths
        Set<Integer> movieLengthsSeen = new HashSet<>();

        Arrays.sort(movieLengths);
        for (int firstMovieLength : movieLengths) {
            int matchingSecondMovieLength = flightLength - firstMovieLength;
            if(movieLengthsSeen.contains(matchingSecondMovieLength)) {
                return true;
            }
            movieLengthsSeen.add(firstMovieLength);
        }
        return false;
    }

    // runs in O(n).
}
