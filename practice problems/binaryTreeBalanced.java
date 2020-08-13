public class YourBinaryTree extends BinaryTree{

    
    public YourBinaryTree(){}
    
    @Override
    protected boolean heightBalanced(){
        if(super.root!=null){
            return isBalanced(super.root);
        }
        return true;
    }
    
    private int height(Node n){
        if(n==null) return 0;
        else{
            return Math.max(height(n.right), height(n.left))+1;
        }
    }
    
    private boolean isBalanced(Node n){
        if(n==null) return true;
        if(Math.abs(height(n.left)-height(n.right))<=1 && isBalanced(n.left) && isBalanced(n.right)){
            return true;
        }else return false;
    }
    
    
    
}