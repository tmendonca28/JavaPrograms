import java.util.Arrays;

public class IterativeBinarySearch {
    public static void main(String[] args) {
        int[] ints = new int[] {23, 43, 32, 13};
        int number = 13;
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        binarySearch(ints, number);
    }

    public static void binarySearch(int[] numbers, int number){
        int first = 0;
        int last = numbers.length-1;
        int middle = (first+last)/2;

        while(first<=last){
            if(numbers[middle]<number){
                first = middle + 1;
            } else if (numbers[middle]==number){
                System.out.print("Found at position  " + middle);
                break;
            } else {
                last = middle -1;
            }
            middle = (first + last)/2;
        }
        if (first > last){
            System.out.println("Number not present :( ");
        }
    }
}
