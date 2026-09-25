package be.vdab.jpfhfdst20;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * JAVA COLLECTIONS - INTERVIEW NOTES
 *
 * LIST:
 * - Allows duplicates.
 * - Preserves element order.
 * - Provides index-based access.
 * - Examples: ArrayList, LinkedList.
 *
 * SET:
 * - Does not allow duplicates.
 *
 * HashSet:
 * - No guaranteed order.
 * - Uses equals() and hashCode().
 *
 * LinkedHashSet:
 * - Preserves insertion order.
 * - Uses equals() and hashCode().
 *
 * TreeSet:
 * - Maintains sorted order.
 * - Uses Comparable or Comparator.
 *
 * COMPARABLE vs COMPARATOR:
 * - Comparable: natural ordering,
 *   compareTo().
 * - Comparator: custom ordering,
 *   compare().
 *
 * HASHING CONTRACT:
 * - Equal objects MUST have equal hash codes.
 * - Equal hash codes do NOT imply equal objects.
 */

public class SetVoorbeeld {

    void main() {

        /*
         * HASHSET
         *
         * - Does not allow duplicate elements.
         * - Does not guarantee iteration order.
         * - Uses hashCode() and equals().
         * - Allows one null element.
         */

        Set<String> hashSet = new HashSet<>();

        hashSet.add("fiets");
        hashSet.add("boom");
        hashSet.add("aap");
        hashSet.add("fiets"); // Duplicate: ignored.
        hashSet.add(null);

        IO.println("HashSet:");
        IO.println(hashSet);


        /*
         * LINKEDHASHSET
         *
         * - Does not allow duplicates.
         * - PRESERVES INSERTION ORDER.
         * - Uses hashCode() and equals().
         * - Allows one null element.
         *
         * Use it when you need unique elements
         * in the order they were added.
         */

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("fiets");
        linkedHashSet.add("boom");
        linkedHashSet.add("aap");
        linkedHashSet.add("fiets"); // Ignored.
        linkedHashSet.add(null);

        IO.println("\nLinkedHashSet:");
        IO.println(linkedHashSet);


        /*
         * TREESET
         *
         * - Does not allow duplicates.
         * - Keeps elements automatically SORTED.
         * - Uses compareTo() or Comparator.
         * - Does not accept null with natural ordering.
         *
         * If compareTo() returns 0,
         * TreeSet considers elements duplicates.
         */

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("fiets");
        treeSet.add("boom");
        treeSet.add("aap");
        treeSet.add("fiets"); // Ignored.

        IO.println("\nTreeSet:");
        IO.println(treeSet);
    }
}