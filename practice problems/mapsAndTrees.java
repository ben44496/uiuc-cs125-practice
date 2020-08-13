import java.util.*;

public class YourBinaryTree extends BinaryTree{
    public YourBinaryTree(){}
    
    protected Map<Object, Integer> valueCount(){
        Map<Object,Integer> map = new HashMap<Object, Integer>();
        if(super.root==null)return map;
        else{
            recursive(super.root, map);
        }
        return map;
    }
    
    private void myPut(Node n, Map<Object,Integer> map){
        if(map.containsKey(n.value)){
            map.put(n.value, map.get(n.value)+1);
        }else{
            map.put(n.value, 1);
        }
    }
    
    private void recursive(Node n, Map<Object,Integer> map){
        if(n!=null){
            myPut(n, map);
            if(n.right!=null) recursive(n.right, map);
            if(n.left!=null) recursive(n.left, map);
        }
    }
    
}