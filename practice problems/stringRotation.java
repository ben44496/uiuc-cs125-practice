String rotateRight(String s, int rotate) {
    char[] dummy = s.toCharArray();
    char[] output = new char[dummy.length];
    
    // rearrange output array
    for (int i = 0; i < output.length; i++) {
        output[(i + rotate) % output.length] = dummy[i];
    }
    
    // convert array to string
    return new String(output);
}
String rotateRightOptimized(String s, int rotate){
    //for example, s="Hello, World" rotate=3
    
    //get the spot where the split should happen
    //ex. Hello, Wo|rld
    //             ^
    //the modulo is so that i won't be negative or greater than s.length()
    //this is assuming that rotate isn't negative
    int i = s.length() - rotate % s.length();
    
    //get the left part of the output from the right side of the input string
    //for this example it would be "rld"
    String left = s.substring(i);
    //get the right part of the output from the left side of the input string
    //for this example it would be "Hello, Wo"
    String right = s.substring(0, i);
    //Concatinate them, result will be "rldHello, Wo"
    return left + right;
}