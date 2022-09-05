import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class NaryLOT{
    static List<List<Integer>> levelOrderTraversalOfNaryTree(Node root){
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue <Node> qn = new LinkedList<>();
        qn.offer(root);

        while(!qn.isEmpty()){
            int QueueSize = qn.size();
            List<Integer> l = new List<>();
            while(size-->0){
                Node head = qn.poll();
                l.add(child.val);
                
                for(Node child: head.children){
                    qn.offer(child);
                }

            }
            ans.add(l);
        }
        return ans;
    }
}

// class Node{
//     Node left, right;
//     int data;
//     Node(int data){
//         this.data = data;
//     }
// }
