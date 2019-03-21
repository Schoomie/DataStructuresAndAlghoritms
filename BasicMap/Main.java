package BasicMap;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Kuba on 14/03/2019.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(2,"Two");
        map1.put(4,"Four");
        map1.put(8,"Eight");
        map1.put(10,"Ten");
        map1.put(1,"One");


       for(Map.Entry<Integer,String> entry: map1.entrySet()){
           int key = entry.getKey();
           String value = entry.getValue();

           System.out.println(key + ": "+value);
       }
    }


}
