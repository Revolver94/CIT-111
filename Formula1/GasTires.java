/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula1;

/**
 *
 * @author tom
 */
public class GasTires {
    // member variables
    public String driverName;
    public int tankSize;
        
    public int gallonsRemaining = 29;
    public int tirePercentRemaining = 100;
    
    public void simulateDriving(int gasUsed){
        gallonsRemaining = gallonsRemaining - gasUsed;
    }//close method
    
    public void simulateTires(int tiresUsed){
        tirePercentRemaining = tirePercentRemaining - tiresUsed;
    }//close method
    
    public int getGallonsRemaining(){
        return gallonsRemaining;
    }//close method
    
    public int getTirePercentRemaining(){
        return tirePercentRemaining;
    }//close method
    
}
