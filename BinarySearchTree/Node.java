
/**
 * A node of a tree stores a data item and references to the child
 * nodes to the left and to the right
 */
public class Node
{
 public Comparable data;
 public Node left;
 public Node right;
 
 public void addNode(Node newNode)
 {
     if (newNode.data.compareTo(data) < 0)
        {
            if (left==null)
                left = newNode;
                else
                 left.addNode(newNode);
        }
        else
        {
            if(right==null)
            right = newNode;
            
          else
          right.addNode(newNode);
          
        }
        
}

 public void printNodes()
  {
      if (left!=null)
       left.printNodes();
      System.out.println(data);
      if (right!=null)
         right.printNodes();
  }
}  
                
