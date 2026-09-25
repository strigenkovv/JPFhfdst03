package be.vdab.jpfhfdst20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapVoorbeeld {

    void main() {

        /*
         * HASHMAP
         *
         * - Stores key-value pairs.
         * - Keys must be unique.
         * - Does NOT guarantee iteration order.
         * - Uses hashCode() and equals() for keys.
         * - Allows one null key and multiple null values.
         */

        Map<String, String> landen = new HashMap<>();

        landen.put("B", "Belgie");
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");

        IO.println("HASHMAP");

        // Get a value using its key.
        IO.println("Country F: " + landen.get("F"));

        // Existing key: replace the value.
        // put() returns the previous value.
        var vorigeWaarde = landen.put("F", "Finland");

        IO.println("Previous value: " + vorigeWaarde);

        // Iterate over keys.
        for (var key : landen.keySet()) {
            IO.println("Key: " + key);
        }

        // Iterate over values.
        for (var value : landen.values()) {
            IO.println("Value: " + value);
        }

        // Iterate over key-value pairs.
        for (var entry : landen.entrySet()) {
            IO.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }

        /*
         * LINKEDHASHMAP
         *
         * - Stores key-value pairs.
         * - Preserves INSERTION ORDER by default.
         * - Uses hashing and a linked structure.
         */

        Map<String, String> linked = new LinkedHashMap<>();

        linked.put("B", "Belgie");
        linked.put("NL", "Nederland");
        linked.put("F", "Frankrijk");
        linked.put("D", "Duitsland");

        IO.println("\nLINKEDHASHMAP");

        for (var entry : linked.entrySet()) {
            IO.println(entry);
        }

        /*
         * TREEMAP
         *
         * - Stores key-value pairs.
         * - Automatically SORTS BY KEY.
         * - Uses Comparable or Comparator.
         * - With natural ordering, null keys
         *   are not permitted.
         */

        Map<String, String> sorted = new TreeMap<>();

        sorted.put("B", "Belgie");
        sorted.put("NL", "Nederland");
        sorted.put("F", "Frankrijk");
        sorted.put("D", "Duitsland");

        IO.println("\nTREEMAP");

        for (var entry : sorted.entrySet()) {
            IO.println(entry);
        }
    }
}