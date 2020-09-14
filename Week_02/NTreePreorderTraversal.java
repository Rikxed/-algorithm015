/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> resultList = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null) return resultList;
        resultList.add(root.val);
        root.children.forEach(n->{
            preorder(n);
        });
        return resultList;
    }

}