import java.util.Set;

public class Lab_7 {


    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println("Adding");
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);

        System.out.println("size: " + set.size());
        System.out.println("contains 'B': " + set.contains("B"));
        System.out.println("contains 'D': " + set.contains("D"));

        System.out.println("Removing");
        set.remove("B");
        System.out.println("Set size after removal: " + set.size());
        System.out.println("contains 'B' " + set.contains("B"));

        System.out.println("Adding a collection of elements to the set ");
        Set<String> otherSet = Set.of("C", "D", "E","F");
        set.addAll(otherSet);
        System.out.println("Size after add: " + set.size());

        System.out.println("Removing elements present in another collection:");
        Set<String> removeSet = Set.of("C", "D");
        set.removeAll(removeSet);
        System.out.println("Size after remove: " + set.size());

        System.out.println("Retain");
        Set<String> retainSet = Set.of("A", "F");
        set.retainAll(retainSet);
        System.out.println("Set size after retaining elements: " + set.size());

        System.out.println("Clearing");
        set.clear();
        System.out.println("Size after clear: " + set.size());;
    }
}
