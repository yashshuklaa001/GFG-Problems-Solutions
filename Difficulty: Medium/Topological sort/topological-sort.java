class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int u=edge[0];
            int v=edge[1];
            graph.get(u).add(v);
        }
        boolean []visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,visited,graph,stack);
            }
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
    static void dfs(int currentNode, boolean []visited,ArrayList<ArrayList<Integer>> graph,Stack<Integer> stack){
        visited[currentNode]=true;
        for(int neighbour:graph.get(currentNode)){
            if(!visited[neighbour]){
                dfs(neighbour,visited,graph,stack);
            }
        }
        stack.push(currentNode);
    }
}