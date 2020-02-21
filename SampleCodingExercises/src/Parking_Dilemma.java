import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Result {

    /*
     * Complete the 'carParkingRoof' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY cars
     *  2. INTEGER k
     */

    public static long carParkingRoof(List<Long> cars, int k) {
        Collections.sort(cars);
        long roof = 0;
        int n = cars.size();
        long roof_length = cars.get(n - 1);
        int times = n - k + 1;
        int i = 0;
        while (i < times) {
            roof = cars.subList(i, i + k).get(k - 1) - cars.subList(i, i + k).get(0);
            if (roof_length > roof + 1) {
                roof_length = roof + 1;

            }
            i++;

        }


        return roof_length;
    }
}


public class Parking_Dilemma {
    public static void main(String[] args) throws IOException {

        long k =4;

        List<Long> cars = new ArrayList<>();

        cars.add((long) 2);
        cars.add((long) 10);
        cars.add((long) 8);
        cars.add((long) 17);
        cars.add((long) 3);

        int n = cars.size();



//        long result = Result.carParkingRoof(cars, k);
        System.out.println(k);
        for(int i = 0 ; i< n ;i++){

            System.out.print(cars.get(i)+ " ");
        }

        long x = Result.carParkingRoof(cars,4);
        System.out.println("\n");
        System.out.println(x);
    }
}