public class Ferret implements Comparable{
    private double length=0;
    
    public Ferret(double l){
        length =l;
    }
    public void setLength(double l){length=l;}
    public double getLength(){return length;}
    
    @Override
    public int compareTo(Object second){
        if(second!=null && second instanceof Ferret){
            return (int)(this.length - ((Ferret)second).getLength());
        }
        return -1;
    }
}