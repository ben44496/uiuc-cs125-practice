public class YourSimpleLinkedList extends SimpleLinkedList{
    
    public YourSimpleLinkedList(){
        super();
    }
    
    @Override
    protected int countNegative(){
        Item i = this.start;
        int count = 0;
        while(i!=null){
            if(i.value <0)count++;
            i = i.next;
        }
        return count;
    }
}