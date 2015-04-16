/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguess;

/**
 *
 * @author nagnello
 */
public class NumberGuessService {
    private int randNumber;
    private NumberGuessResult results;
    private NumberGuessRange range;
    
    public void startGame(){
        
        randNumber =  (int)Math.floor((Math.random() * 10) + 1);
        results = new NumberGuessResult(randNumber);
        range = new NumberGuessRange();
    }
    
    public String checkGuess(String guess) throws NumberFormatException{
        return results.checkGuess(guess);
    }
    
    public void InputMinAndMax(String min,String max) throws NumberFormatException{
        range.setMinAndMax(min,max);
    }
    
        
      
}
