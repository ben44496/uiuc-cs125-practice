public class RightTriangle extends Shape{
    private int length;
    
    public RightTriangle(int s){
        super("righttriangle");
        length = s;
    }
    
    public int getLength()
    {
        return length;
    }

    public double area()
    {
        //the d at the end means it is a double constant
        return  0.5d * (double)length * (double)length;
    }
    
    @Override
    public boolean equals(Object other){
        if(other!=null && other instanceof RightTriangle){
            return ((RightTriangle)other).getLength() == length;
        }
        return false;
    }
}