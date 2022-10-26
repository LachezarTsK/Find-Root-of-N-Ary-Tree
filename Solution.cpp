
#include <vector>
using namespace std;

class Solution {
    
public:
    Node* findRoot(vector<Node*> tree) {
        int rootValue = 0;
        for (const auto& node : tree) {
            rootValue ^= node->val;
            vector<Node*>& branches = node->children;
            for (const auto& branchNode : branches) {
                rootValue ^= branchNode->val;
            }
        }

        Node* root = nullptr;
        for (const auto& node : tree) {
            if (rootValue == node->val) {
                root = node;
                break;
            }
        }
        return root;
    }
};

/*
Struct Node is in-built in the solution file on leetcode.com. 
When running the code on the website, do not include this struct.
 */
class Node {
    
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
