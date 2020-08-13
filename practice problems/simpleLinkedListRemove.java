public class YourSimpleLinkedList extends SimpleLinkedList {
    YourSimpleLinkedList(Object[] values) {
        super(values);
    }
    
    public Object remove(int index){
        // We want the previous Item before this index to then point to the next Item after this index
        if((index<0 || index>=super.currentSize ||super.start==null)){
            return null;
        }
        int currentIndex=0;
        if(index==0){
            Item toReturn= super.getItem(index);
            super.start = super.getItem(index).next;
            super.currentSize--;
            return toReturn.value;
        }
        for(Item current=start; current!=null && index!=0; current = current.next){
            if(currentIndex == index-1){
                Item toReturn = super.getItem(index);
                current.next = super.getItem(index).next;
                super.currentSize--;
                return toReturn.value;
            }
            currentIndex++;
        }
        return null;
    }
}