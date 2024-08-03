import java.util.*;

public class HashMapBasics {

    public static void main(String[] args) {

        Map<String, String> mapping = new TreeMap<>();

        //insertion
        mapping.put("in", "India");
        //mapping.put("in", "India2");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println(mapping);

        Map<String,String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println("After: " + table);

        //deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("usa", "NONE"));

        System.out.println(table.containsKey("im"));

        System.out.println(table.containsValue("United States of AMerica"));
        System.out.println(table);

        table.replace("in", "Indonesia");
        System.out.println(table);

        Set<String> keyset= table.keySet();
        System.out.println(keyset);

        Collection<String> valueSet= table.values();
        System.out.println(valueSet);

        //get all the entries from map
        Set<Map.Entry<String,String>> entryset = table.entrySet();
        System.out.println("Printing entries: "+entryset);












//        table.putIfAbsent("is", "India3");
//        System.out.println(table);
        //System.out.println(table.size());
        //table.clear();
        //System.out.println(table.size());







    }


}
