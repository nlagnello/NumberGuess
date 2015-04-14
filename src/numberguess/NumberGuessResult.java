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
public class NumberGuessResult{
    private int randNumber;
    
    
    public NumberGuessResult(int randNumber){
       this.randNumber =  randNumber;
    }
    
    
    
    public String checkGuess(String guess) throws NumberFormatException{
        
        int input = Integer.valueOf(guess.trim());
        
        if(input <= 0 ){
            return "Error, number must be greater than zero";
        } else if(input > randNumber){
            return "Too High";
        }else if(input < randNumber){
            return "Too Low";
        }else{
            return "Correct! You successfully guessed " + randNumber;
        }
    }
    
}
