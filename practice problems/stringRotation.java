String rotateRight(String s, int rotate){
    int i = (s.length() - rotate) % s.length();
    return s.substring(i) + s.substring(0, i);
}