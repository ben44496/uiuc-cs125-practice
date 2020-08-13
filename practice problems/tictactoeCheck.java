char checkBoard(char[][] board){
        boolean bool = true;
        // Check Horizontal
        if(board == null) return '.';


        int counter=0;
        for(int row=0; row<board.length; row++){
            bool=true;
            char myChar = board[row][0];

            for(int i=0; i<board[row].length && myChar != '.'; i++) {
                if (board[row][i] == myChar && bool){ counter++;}
                else {counter = 0; bool=false;}
            }
            if(counter==3) return myChar;

            bool=true;
            myChar = board[0][row];
            for(int i=0; i<board[0].length && myChar != '.'; i++){
                if (board[i][row] == myChar && bool){ counter++;}
                else {counter = 0; bool=false;}
            }
            if(counter==3) return myChar;
        }

        return '.';
    }