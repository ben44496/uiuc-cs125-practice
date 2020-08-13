public class SimpleArrayList implements SimpleList{
    /** Internal array for storing values. */
    private Object[] array;

    /**
     * Create a list from an array of Objects.
     *
     * Copies references from the passed array so that
     * modifications to this list will not affect the original array.
     * We'll need to make copies of the array later to support add and remove,
     * so this is the right thing to do now.
     *
     * @param originalArray original array of Objects used to create the list
     */
    SimpleArrayList(Object[] originalArray) {
        // Would normally need to defend against originalArray being null,
        // but we'll defer that until later.
        if (originalArray != null) {
            array = new Object[originalArray.length];
            for (int i = 0; i < originalArray.length; i++) {
                array[i] = originalArray[i];
            }
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }
        return array[index];
    }
    public void set(int index, Object element) {
        if (index < 0 || index >= array.length) {
            return;
        }
        array[index] = element;
    }

    public int size() {
        return array.length;
    }

    public Object remove(int removeIndex) {
        if (removeIndex < 0 || removeIndex >= array.length) {
            return null;
        }

        // remove returns the item being removed
        Object toReturn = array[removeIndex];

        // Create and populate our new smaller array. We use for loop syntax
        // maintaining two indices.
        Object[] newArray = new Object[array.length - 1];
        int originalIndex = 0;
        for (int newIndex = 0; newIndex < newArray.length; newIndex++) {
            // Skip the spot that we are removing
            if (newIndex == removeIndex) {
                originalIndex++;
            }
            newArray[newIndex] = array[originalIndex];
            originalIndex++;
        }
        array = newArray;
        return toReturn;
    }
    
    public void add(int index, Object obj){
        Object[] newArray = new Object[array.length + 1];
        int in = 0;
        int ind = 0;
        if(!(index < 0 || index >= array.length)){
            for(int i=0; i<index; i++){
                newArray[ind] = array[in];
                ind++;
                in++;
            }
            newArray[ind] = obj;
            ind++;
            for(int i=ind; i<newArray.length; i++){
                newArray[ind] = array[in];
                ind++; in++;
            }
        }else if(index ==array.length){
            for(int i=0; i<array.length; i++){
                newArray[i]=array[i];
            }
            newArray[array.length] = obj;
        }
        array = newArray;
    }
}