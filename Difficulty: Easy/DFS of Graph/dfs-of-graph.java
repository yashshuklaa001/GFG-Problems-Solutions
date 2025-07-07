class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        final int V = adj.size();
        boolean visited[] = new boolean[V];
        ArrayList<Integer> dfsResult = new ArrayList<>();
        helper(0, adj, visited, dfsResult);
        return dfsResult;
    }
    void helper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                helper(neighbor, adj, visited, result);
            }
        }
    }
}
