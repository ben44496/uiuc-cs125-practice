public class InsertionSorter{
    public InsertionSorter(){
        
    }
  
    public static int sort(Comparable[] array){
        int counter=0;
        if(array==null || array.length<2) return 0;
        for(int marker = 1;marker<array.length; marker++){
            
            int index=marker;

            for(int i=marker-1; i>=0 && array[index].compareTo(array[i])<0; i--){
                _swap(array, index, i);
                counter++; index--;
            }
        }
        return counter;
    }
    private static void _swap(Comparable[] array, int index1, int index2){
        Comparable aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }
}