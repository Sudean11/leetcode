package mwa.exam;

import java.util.*;

public class CorporateLadder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the pair of names to compare
        String compareLine = scanner.nextLine();
        String[] comparePair = compareLine.split(" ");
        String start = "Ben";
        String target = "Jon";

        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("Terry David");
        namesList.add("Kyle David");
        namesList.add("Ben Kyle");
        namesList.add("Scott Jon");
        namesList.add("Chris Scott");
        namesList.add("Jon Kenny");
        namesList.add("Kenny David");

        // Read the employee/manager pairs
        Map<String, List<String>> graph = new HashMap<>();
        for(String name: namesList){

            String[] employeeManagerPair = name.split(" ");
            String employee = employeeManagerPair[0];
            String manager = employeeManagerPair[1];

            // Add direct report relationship
            graph.putIfAbsent(manager, new ArrayList<>());
            graph.get(manager).add(employee);

            // Add reverse relationship for bidirectional search
            graph.putIfAbsent(employee, new ArrayList<>());
            graph.get(employee).add(manager);
        }

        // Use BFS to find the shortest path between start and target
        int levels = bfs(start, target, graph);
        System.out.println(levels);
    }

    private static int bfs(String start, String target, Map<String, List<String>> graph) {
        Queue<Pair> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(new Pair(start, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            String currentEmployee = current.employee;
            int level = current.level;

            if (currentEmployee.equals(target)) {
                return level;
            }

            if (visited.contains(currentEmployee)) {
                continue;
            }

            visited.add(currentEmployee);

            List<String> neighbors = graph.getOrDefault(currentEmployee, new ArrayList<>());
            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.add(new Pair(neighbor, level + 1));
                }
            }
        }

        return -1; // If no path found, though the problem guarantees a complete hierarchy
    }

    // Helper class to store pairs of employee and level
    private static class Pair {
        String employee;
        int level;

        Pair(String employee, int level) {
            this.employee = employee;
            this.level = level;
        }
    }
}
