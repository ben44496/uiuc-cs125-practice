public class YourBinaryTree extends BinaryTree {
   
    // Overriden method 
    public int sum() {
        return sum(root);
    }
    
    private int sum (Node current) {
        /* 
            This is our base case. We need to return 0 when there are no more leaves left in the binary tree.
        */
        if (current == null) {
            return 0;
        }
        /* 
            This is used to wrap  current's value as an Integer, since value is currently of type Object. 
        */
        Integer newValue = (Integer) current.value;
        /* 
            This is the recursive portion of the code, where we keep going down the binary tree, adding the value of each leaf.
        */
        return newValue.intValue() + sum(current.left) + sum(current.right);
    }
}
