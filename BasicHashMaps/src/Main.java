import java.util.HashMap;
import java.util.Map;

public class Main {
    static HashMap<String, Boolean> map = new HashMap<>();
    public static void main(String[] args) {
        map.put("Anthony", true);
        map.put("Juliet", false);

        System.out.println(map.get("Juliet"));

        if(map.containsKey("Jack")) {
            System.out.println(1);
        }
        if(map.containsValue(Boolean.FALSE)){
            System.out.println(2);
        }

        for(String s: map.keySet()){
            System.out.println(s);
        }

        for(Map.Entry kv : map.entrySet()) {
            System.out.println(kv);
        }

        map.remove("Anthony");

        System.out.println(map);

        HashMap<String, Integer> lightBulbToHoursOfLight = new HashMap<>();

        lightBulbToHoursOfLight.put("incandescent", 1200);
        lightBulbToHoursOfLight.put("compact fluorescent", 10000);
        lightBulbToHoursOfLight.put("LED", 50000);
    }
}
