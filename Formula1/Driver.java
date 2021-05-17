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
public class Driver {
    //public member variables
    public String name;
    public String team;

    //private member variable
    private int fuelUseInGallons;
    private int tireUseInPercent;
    private int LapsDriven;
    
    //Method to simulate drivinglaps
    public void driveLaps(GasTires gasUsed){
        //simulate driving and gas usage
        gasUsed.simulateDriving(fuelUseInGallons);
    }//close method
    
        //Method to simulate drivinglaps
    public void driveLaps2(GasTires tiresUsed){
        //simulate driving and tire usage
        tiresUsed.simulateTires(tireUseInPercent);
    }//close method
    
    //"getter" method for fuel use
    public int getFuelUseInGallons(){
        return fuelUseInGallons;
    }//close method
    
    //setter method for fuel use
    public void setFuelUseInGallons(int fuelUseInGallons){
        this.fuelUseInGallons = fuelUseInGallons;
    }//close method
    
        //"getter" method for fuel use
    public int getTireUseInPercent(){
        return fuelUseInGallons;
    }//close method
    
    //setter method for fuel use
    public void setTireUseInPercent(int tireUseInPercent){
        this.tireUseInPercent = tireUseInPercent;
    }//close method
    
    //"getter" method for Laps Driven
    public int getLapsDriven(){
        return LapsDriven;
    }//close method
    
    //setter method for laps driven
    public void setLapsDriven(int LapsDriven){
        this.LapsDriven = LapsDriven;
    }//close method
    
}
