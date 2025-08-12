class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        final int V=adj.size();
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.offer(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            int current = queue.poll();
            result.add(current);
            for(int neighbour:adj.get(current)){
                if(!visited[neighbour]){
                    queue.add(neighbour);
                    visited[neighbour]=true;
                }
            }
        }
        return result;
    }
}