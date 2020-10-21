/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        return cloneNode(node, new HashMap<>());
    }
    public Node cloneNode(Node node, Map<Integer, Node> nodeMap){
        Node newNode = new Node(node.val);
        nodeMap.put(node.val, newNode);
        if(node.neighbors != null){
            for(int i=0; i<node.neighbors.size(); i++){
                if(nodeMap.get(node.neighbors.get(i).val) == null){
                    newNode.neighbors.add(cloneNode(node.neighbors.get(i), nodeMap));                    
                }
                else{
                    newNode.neighbors.add(nodeMap.get(node.neighbors.get(i).val));
                }
            }
        }
        return newNode;
    }
}
//https://leetcode.com/problems/clone-graph/