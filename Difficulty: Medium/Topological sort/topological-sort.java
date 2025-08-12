class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
         ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
         boolean visited[] = new boolean[V];
         Stack<Integer> stack = new Stack<>();
         ArrayList<Integer> result = new ArrayList<>();
         
         for(int i=0;i<V;i++){
             graph.add(new ArrayList<>());
         }
         for(int edge[]: edges){
             int u = edge[0];
             int v = edge[1];
             graph.get(u).add(v);
         }
         for(int i=0;i<V;i++){
             if(!visited[i]){
                 dfs(graph,i,visited,stack);
             }
         }
         while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph,int node,boolean visited[],Stack<Integer> stack){
        visited[node]=true;
        for(int ele : graph.get(node)){
            if(!visited[ele]){
                dfs(graph,ele,visited,stack);
            }
        }
        stack.push(node);
    }
}