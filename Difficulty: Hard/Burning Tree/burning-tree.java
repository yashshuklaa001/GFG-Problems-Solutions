import java.util.*;

class Solution {
    
    // Node class is assumed to be defined as:
    // class Node {
    //     int data;
    //     Node left, right;
    //     Node(int value) {
    //         data = value;
    //         left = right = null;
    //     }
    // }

    public static int minTime(Node root, int target) {
        Map<Node, Node> parentMap = new HashMap<>();
        Node targetNode = mapParents(root, parentMap, target);
        return burnTree(targetNode, parentMap);
    }

    // Step 1: Build parent map and find target node
    private static Node mapParents(Node root, Map<Node, Node> parentMap, int target) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        Node targetNode = null;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.data == target) {
                targetNode = current;
            }

            if (current.left != null) {
                parentMap.put(current.left, current);
                queue.offer(current.left);
            }

            if (current.right != null) {
                parentMap.put(current.right, current);
                queue.offer(current.right);
            }
        }

        return targetNode;
    }

    // Step 2: Perform BFS to simulate burning
    private static int burnTree(Node targetNode, Map<Node, Node> parentMap) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        queue.offer(targetNode);
        visited.add(targetNode);

        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean burned = false;

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                for (Node neighbor : Arrays.asList(current.left, current.right, parentMap.get(current))) {
                    if (neighbor != null && !visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.offer(neighbor);
                        burned = true;
                    }
                }
            }

            if (burned) {
                time++;
            }
        }

        return time;
    }
}
