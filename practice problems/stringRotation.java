public String rotateRight(String s, int rotate) {
    char[] dummy = s.toCharArray();
    char[] output = new char[dummy.length];
    
    // copy dummy into output array. note that arrays in java are by reference, not by value.
    for (int i = 0; i < output.length; i++) {
        output[i] = dummy[i];
    }
    
    // rearrange output array
    for (int i = 0; i < output.length; i++) {
        output[(i + rotate) % output.length] = dummy[i];
    }
    
    // convert array to string
    return new String(output);
}
