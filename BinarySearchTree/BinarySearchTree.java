
/**
*implements a binary search tree.
*Nodes hold objects that implements comparable interface
 */
public class BinarySearchTree
{
    // instance variables - replace the example below with your own
    private Node root;

    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree()
    {
       root = null;
    }

    /**
     *inserts new element. Parameter contains object to insert
     */

    public void add(Comparable obj)
    {
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;
        if (root == null)
        root =newNode;
        else
            root.addNode(newNode);
        
    }
    /**
     * prints contents of tree in sorted order
     */
    
    public void print()
    {
        if (root != null)
        root.printNodes();
}
}
