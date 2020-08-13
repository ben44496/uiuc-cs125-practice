public class Max{
    public Max(){
        
    }

    public static Comparable max(Comparable first, Comparable second){
        if(first.compareTo(second)>=0)return first;
        else return second;
    }
}