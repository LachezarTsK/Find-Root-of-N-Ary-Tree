
/**
 * @param {Node[]} tree
 * @return {Node}
 */
var findRoot = function (tree) {
    let rootValue = 0;
    for (let node of tree) {
        rootValue ^= node.val;
        const branches = node.children;
        for (let branchNode of branches) {
            rootValue ^= branchNode.val;
        }
    }

    let root = null;
    for (let node of tree) {
        if (rootValue === node.val) {
            root = node;
            break;
        }
    }
    return root;
};

/*
 Function Node is in-built in the solution file on leetcode.com. 
 When running the code on the website, do not include this function.
 */
function Node(val, children) {
    this.val = val === undefined ? 0 : val;
    this.children = children === undefined ? [] : children;
}
