public class YourBinaryTree extends BinaryTree{
    
    public YourBinaryTree(){
        super();
    }
    
    @Override
    protected int countLessThan(Comparable value){
        if(value ==null) throw new IllegalArgumentException();
        return check(this.root, value);
    }
    
    private int check(Node n, Comparable value){
        if(n==null)return 0;
        else if(n.value.compareTo(value) >0){
            return check(n.right, value) + check(n.left, value) + 1;
        }
        return check(n.right, value) + check(n.left, value);
    }
}