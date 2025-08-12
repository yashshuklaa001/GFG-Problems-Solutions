class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        final int V=adj.size();
        boolean visited[] = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        helper(0,adj,visited,result);
        return result;
    }
    void helper(int node,ArrayList<ArrayList<Integer>> adj,boolean visited[],ArrayList<Integer> result){
        visited[node]=true;
        result.add(node);
        for(int neighbour:adj.get(node)){
            if(!visited[neighbour]){
                helper(neighbour,adj,visited,result);
            }
        }
    }
}