/*class Node

class Node
{
   int data;
   Node right,down;

   Node(int data){
       this.data = data;
       right = null;
       down = null;
   }
}
*/
/*Function should return the head of the 2D LL.*/
class Solution {
    static Node construct(int arr[][]) {
        return buildList(arr, 0, 0);
    }

    static Node buildList(int arr[][], int i, int j) {
        if (i >= arr.length || j >= arr[0].length) {
            return null;
        }

        Node curr = new Node(arr[i][j]);
        curr.right = buildList(arr, i, j+1);
        curr.down = buildList(arr, i+1, j);

        return curr;
    }
}
