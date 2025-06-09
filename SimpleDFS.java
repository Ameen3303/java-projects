package java_with_DSA;

import java.util.*;

public class SimpleDFS {

    private Map<String, List<String>> homemap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    public void addRoom(String room, String connectedRoom)
    {
        homemap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homemap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()).add(room); 
    }

    public void dfs(String currentRoom) 
    {
        if (visited.contains(currentRoom)) return;

        visited.add(currentRoom);
        System.out.println("visited: " + currentRoom);

        for (String neighbor : homemap.getOrDefault(currentRoom, new ArrayList<>()))
        {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
       
    	SimpleDFS house = new SimpleDFS();

        house.addRoom("Living Room","Kitchen");
        house.addRoom("Living Room","Bathroom");
        house.addRoom("Kitchen","Pantry");
        house.addRoom("Bathroom","Bedroom");

        house.dfs("Living Room");
    }
}
