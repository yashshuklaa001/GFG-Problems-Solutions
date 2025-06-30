/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node = node;
            this.hd=hd;
        }
    }
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        if(root==null){
            return result;
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair pair = queue.poll();
            Node currentNode = pair.node;
            int horDistance=pair.hd;
            if(map.get(horDistance)==null){
                map.put(horDistance,currentNode.data);
            }
            if(currentNode.left!=null){
                queue.add(new Pair(currentNode.left,horDistance-1));
            }
            if(currentNode.right!=null){
                queue.add(new Pair(currentNode.right,horDistance+1));
            }
        }
        for(int v:map.values()){
            result.add(v);
        }
        return result;
    }
}