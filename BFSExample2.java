package java_with_DSA;

import java.util.*;

public class BFSExample2 {

    public static void main(String[] args) {
        Map<String, List<String>> m = new HashMap<>();

        m.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
        m.put("Reptile House", Arrays.asList("Snake Pit"));
        m.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion")); // Capitalized properly
        m.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
        m.put("Snake Pit", new ArrayList<>());
        m.put("Parrot Pavilion", new ArrayList<>()); // Matching the capitalized name
        m.put("Lion Den", new ArrayList<>());
        m.put("Elephant Enclosure", new ArrayList<>());

        System.out.println("Explore it by using the BFS:");
        bfs(m, "Entrance");
    }

    public static void bfs(Map<String, List<String>> m, String start) {
        Queue<String> q = new LinkedList<>();
        Set<String> v = new HashSet<>();

        q.add(start);
        v.add(start);

        while (!q.isEmpty()) {
            String currentroom = q.poll();
            System.out.println("visited " + currentroom);

            List<String> neighbors = m.get(currentroom);
            if (neighbors != null) { 
            	// Always check to avoid NullPointerException
                for (String n : neighbors) {
                    if (!v.contains(n)) {
                        q.add(n);
                        v.add(n);
                    }
                }
            }
        }
    }
}
