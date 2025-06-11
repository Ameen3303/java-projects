package java_with_DSA;

import java.util.*;

public class DFSExample2 {
    // Graph adjacency list
    private Map<String, List<String>> graph = new HashMap<>();

    // Add connection between two people
    public void addConnection(String person1, String person2) {
        graph.computeIfAbsent(person1, k -> new ArrayList<>()).add(person2);
        graph.computeIfAbsent(person2, k -> new ArrayList<>()).add(person1);
    }

    // Recursive DFS
    public List<String> findSocialCircle(String person) {
        Set<String> visited = new HashSet<>();
        List<String> circle = new ArrayList<>();
        dfsRecursive(person, visited, circle);
        return circle;
    }

    private void dfsRecursive(String person, Set<String> visited, List<String> circle) {
        if (visited.contains(person)) return;
        visited.add(person);
        circle.add(person);
        for (String neighbor : graph.getOrDefault(person, new ArrayList<>())) {
            dfsRecursive(neighbor, visited, circle);
        }
    }

    // Iterative DFS
    public List<String> findSocialCircleIterative(String person) {
        Set<String> visited = new HashSet<>();
        List<String> circle = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        stack.push(person);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                circle.add(current);
                for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                    stack.push(neighbor);
                }
            }
        }
        return circle;
    }

    // Sample usage
    public static void main(String[] args) {
        DFSExample2 finder = new DFSExample2();

        // Sample graph data
        finder.addConnection("Alice", "Bob");
        finder.addConnection("Bob", "Charlie");
        finder.addConnection("David", "Eve");
        finder.addConnection("Eve", "Frank");

        System.out.println("Recursive DFS from Bob: " + finder.findSocialCircle("Bob"));
        System.out.println("Iterative DFS from Eve: " + finder.findSocialCircleIterative("Eve"));
    }
}