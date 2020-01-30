public class StringReversal {
    public static void main(String[] args) {
        String input = "Anthony Mendonca";

        // Convert the string into char array
        char[] tempArray= input.toCharArray();
        int left, right = 0;
        right = tempArray.length-1;

        for(left=0; left<right; left++, right--){
            // Swap values of left and right
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }

        for (char c: tempArray){
            System.out.print(c);
        }
    }
}
