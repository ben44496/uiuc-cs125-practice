public int countArrayLessThan(int[][] array, int check){
    int count =0;
    if(array == null) return 0;
    for(int i=0; i<array.length; i++){
        for(int j=0; j<array[i].length; j++){
            if(array[i][j] < check) count++;
        }
    }
    return count;
}