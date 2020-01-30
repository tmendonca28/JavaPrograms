public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(0);
        int arr[] = new int[4];
        System.out.println(arr.length);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

}
