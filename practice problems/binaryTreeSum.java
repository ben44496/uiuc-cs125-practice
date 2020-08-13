public class YourBinaryTree extends BinaryTree{
    
    
    
    @Override
    protected int sum(){
        return summation(super.root);
    }
    
    private Integer summation(Node current){
        if(current!=null){
            Integer myValue = (Integer) current.value;
            return myValue.intValue() + summation(current.left) + summation(current.right);
        }
        return (Integer) 0;
    }
}