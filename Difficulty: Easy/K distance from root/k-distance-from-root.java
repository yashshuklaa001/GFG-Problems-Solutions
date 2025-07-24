/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
    // Recursive function to print right view of a binary tree.
    ArrayList<Integer> Kdistance(Node root, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root==null){
            return result;
        }
        queue.offer(root);
        int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            if(level==k){
                for(int i=0;i<size;i++){
                    result.add(queue.poll().data);
                }
                return result;
            }
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
            level++;
        }
        return result;
    }
}