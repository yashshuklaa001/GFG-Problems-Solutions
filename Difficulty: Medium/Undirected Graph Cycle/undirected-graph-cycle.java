class Solution {
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int []edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,-1,graph,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int curr,int parent,List<List<Integer>> graph,boolean visited[]){
        visited[curr] = true;
        for(int neighbour : graph.get(curr)){
            if(!visited[neighbour]){
                if(dfs(neighbour, curr, graph, visited)){
                    return true;
                }
            } else if(neighbour != parent){
                return true; // found a cycle
            }
        }
        return false;
    }
}
