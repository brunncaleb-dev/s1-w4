public class WordGuessing {
    private String secretWord;
    private String guess;

    public WordGuessing(String s, String g){
        s = "tyler";
        g = "_____";
    }
    //if letter is in secret 
    //upate correct spot index in guess
    public void updateGuess(String letter){
        g.substring(secretWord.indexOf(letter),g.lengthOf(secretWord));
        
    }
    //return instance variable , guess
    public String getProgress(){

    }
}

