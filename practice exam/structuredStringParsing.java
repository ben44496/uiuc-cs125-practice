public int getYearlySalary(String s){
    if(s==null)return -1;
    String[] array = s.split(";");
    if(array.length >=3){
        return Integer.parseInt(array[2].trim()) * 50;
    }
    return -1;
}