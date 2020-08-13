public class LastTen{
    private int[] myArray;
    private int index;
    
    public LastTen(){
        myArray = new int[]{0,0,0,0,0,0,0,0,0,0};
        index=0;
    }
    
    public void add(int newValue){
        myArray[index] = newValue;
        index++;
        index= index % myArray.length;
        
    }
    
    public int[] getLastTen(){
        return myArray;
    }
}