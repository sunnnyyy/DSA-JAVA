package collection.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * HashMapBasic
 */
public class HashMapBasic {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("us", "United States");
        map.put("in", "India");
        map.putIfAbsent("in", "India2");
        map.put("en", "England");
        // map.remove("us", "USA");
        
        System.out.println(map.containsKey("in"));
        // System.out.println(" contains value: "+ map.containsValue("Indian"));
        
        // System.out.println(map);
        
        System.out.println(map.get("in")); //  if not found return null
        // System.out.println(map.getOrDefault(  "pn" ,"Others"));

        Set<Map.Entry<String, String>> keyValue = map.entrySet(); //  return all key value pair

        for(Map.Entry<String, String> val: keyValue) {
            System.out.println(val.getKey() + " " + val.getValue());
        }

        System.out.println("");
        Set<String> key = map.keySet(); //  return all key
        System.out.println(key);

        Collection<String> value =  map.values(); //  return all value
        List<String> s = new ArrayList<>(value);
        System.out.println(s);

        List<String> list = new ArrayList<>(map.keySet()); //  set into array list
        System.out.println(list);

    }
}