class Solution {
    public int kthAncestor(Node root, int k, int node) {
        if (root == null) return -1;
        Map<Integer, Integer> parent = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        parent.put(root.data, -1);

        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.left != null) {
                parent.put(cur.left.data, cur.data);
                q.offer(cur.left);
            }
            if (cur.right != null) {
                parent.put(cur.right.data, cur.data);
                q.offer(cur.right);
            }
        }
        int cur = node;
        while (k > 0 && cur != -1) {
            cur = parent.getOrDefault(cur, -1);
            k--;
        }
        return cur;
    }
}
