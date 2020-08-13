String rotateRight(String s, int rotate){
        // int index = rotate % (s.length());
        // return s.subString(index, s.length()) + s.subString(0, index);
        char[] word = s.toCharArray();
        char[] retur = new char[s.length()];
        int index=0;
        // This part does the switch
        for(int i =s.length()-rotate%(s.length()); i<s.length(); i++){
            retur[index] = word[i];
            index++;
            //count++;
        }
        // This part does the fill
        int ind=0;
        for(int j=index; j<s.length(); j++){
            retur[index] = word[ind];
            index++;
            ind++;
        }
        return new String(retur);
}