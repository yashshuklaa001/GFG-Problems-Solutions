class Solution {
    public static int floor(Node root, int key) {
        int floor = -1; // if no floor exists

        while (root != null) {
            if (root.data == key) {
                return root.data;
            }

            if (root.data > key) {
                // go left to find smaller value
                root = root.left;
            } else {
                // root.data < key
                // update floor and go right to find closer value
                floor = root.data;
                root = root.right;
            }
        }
        return floor;
    }
}
