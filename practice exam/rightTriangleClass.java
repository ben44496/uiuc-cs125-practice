public class RightTriangle extends Shape{
    private int length;
    
    public RightTriangle(int s){
        super("righttriangle");
        length = s;
    }
    
    public double area(){return (double) 0.5*length*length;}
    
    @Override
    public boolean equals(Object other){
        if(other!=null && other instanceof RightTriangle){
            return (((RightTriangle)other).getLength()==length);
        }
        return false;
    }
    public int getLength(){return length;}
}