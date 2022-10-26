
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public Node findRoot(List<Node> tree) {
        int rootValue = 0;
        for (Node node : tree) {
            rootValue ^= node.val;
            List<Node> branches = node.children;
            for (Node branchNode : branches) {
                rootValue ^= branchNode.val;
            }
        }

        Node root = null;
        for (Node node : tree) {
            if (rootValue == node.val) {
                root = node;
                break;
            }
        }
        return root;
    }
}

/*
Class Node is in-built in the solution file on leetcode.com. 
When running the code on the website, do not include this class.
 */
class Node {

    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};
