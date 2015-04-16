/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguess;

/**
 *
 * @author Nick
 */
public class NumberGuessRange {
    
    private int min;
    private int max;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    
    
    public boolean setMinAndMax(String minimum,String maximum) throws NumberFormatException{
        int tempMin = Integer.valueOf(minimum.trim());
        int tempMax = Integer.valueOf(maximum.trim());
        
        if(tempMin > 0 && tempMax > (tempMin +1)){
        min = tempMin;
        max = tempMax;
        return true;
        }else{
            return false;
        }
        
        
    }
    
    
}
