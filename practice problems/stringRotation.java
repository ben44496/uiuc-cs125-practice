public String rotateRight(String s, int rotate) {
    char[] dummy = s.toCharArray();
    char[] output = new char[dummy.length];
    
    // rearrange output array
    for (int i = 0; i < output.length; i++) {
        output[(i + rotate) % output.length] = dummy[i];
    }
    
    // convert array to string
    return new String(output);
}
