public class Faulter{
    private String exceptionType="";
    public Faulter(String arg) throws IllegalArgumentException{
            if(arg==null)throw new IllegalArgumentException();
            // switch(arg) {
            //     case "NullPointer":
            //         exceptionType=arg;
            //     case "ArrayIndexOutOfBounds":
            //         exceptionType=arg;
            //     case "ClassCast":
            //         exceptionType=arg;
            //     default:
            //         throw new IllegalArgumentException();
            // }
            if(arg=="NullPointer" || arg=="ArrayIndexOutOfBounds" || arg=="ClassCast"){
                exceptionType=arg;
            }else{
                throw new IllegalArgumentException();
            }
        
    }
    
        
    public Exception fault(){
        switch(exceptionType){
            case "NullPointer":
                return new NullPointerException();
            case "ArrayIndexOutOfBounds":
                return new ArrayIndexOutOfBoundsException();
            case "ClassCast":
                return new ClassCastException();
        }
        return new IllegalArgumentException();
    }
}