/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formula1;

import java. util. Scanner;


/**
 *
 * @author tom
 */
public class FormulaLand {
    public static void main(String[] args){
        //welcome message
        System.out.println("Welcome to the exciting world of Formula One!");
        System.out.println("Press 1 to start the race! Press 0 to quit.");
        System.out.print(">> ");
        
        //create scanner object
        Scanner scan = new Scanner(System.in);
        //create variable for menu input
        int inputMenu = scan.nextInt();
        
        //while statement to run program
        while (inputMenu == 1){
            
        System.out.println("");
        System.out.println("***************************");
        System.out.println("The race is on! Driving laps!");
        System.out.println("***************************");
        System.out.println("");
            
        //make a pointers to set up drivers
        Driver LewisHamilton;
        LewisHamilton = new Driver();
        LewisHamilton.name = "Lewis Hamilton";
        LewisHamilton.team = "Mercedes";
        
        LewisHamilton.setLapsDriven(78);
        LewisHamilton.setFuelUseInGallons(28);
        LewisHamilton.setTireUseInPercent(63);
 
        Driver MaxVerstappen;
        MaxVerstappen = new Driver();
        MaxVerstappen.name = "Max Verstappen";
        MaxVerstappen.team = "Red Bull";
        
        MaxVerstappen.setLapsDriven(77);
        MaxVerstappen.setFuelUseInGallons(27);
        MaxVerstappen.setTireUseInPercent(71);
        
        Driver MickSchumacher;
        MickSchumacher = new Driver();
        MickSchumacher.name = "Mick Schumacher";
        MickSchumacher.team = "Haas";
        
        MickSchumacher.setLapsDriven(71);
        MickSchumacher.setFuelUseInGallons(28);
        MickSchumacher.setTireUseInPercent(77);
        
        //adjust fuel usage for drivers
        GasTires gasForLewis = new GasTires();
        gasForLewis.driverName = "Lewis Hamilton";
        gasForLewis.tankSize = 29;

        GasTires gasForMax = new GasTires();
        gasForMax.driverName = "Max Verstappen";
        gasForMax.tankSize = 29;
        
        GasTires gasForMick = new GasTires();
        gasForMick.driverName = "Mick Schumacher";
        gasForMick.tankSize = 29;

        //simulate driving for drivers and display stats
        LewisHamilton.driveLaps(gasForLewis);
        LewisHamilton.driveLaps2(gasForLewis);
        displayDriverStats(LewisHamilton);

        MaxVerstappen.driveLaps(gasForMax);
        MaxVerstappen.driveLaps2(gasForMax);
        displayDriverStats(MaxVerstappen);
        
        MickSchumacher.driveLaps(gasForMick);
        MickSchumacher.driveLaps2(gasForMick);
        displayDriverStats(MickSchumacher);
        
        //display gas usage
        System.out.println("Update from the pit crews!");
        displayGasStats(gasForLewis);       
        displayGasStats(gasForMax);
        displayGasStats(gasForMick);
        
        System.out.println("");
        System.out.println("*****RACE IS FINISHED******");
        System.out.println("Lewis Hamilton wins the race!");
        System.out.println("***************************");
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Do you want to race again?");
        System.out.println("Press 1 to race! Press 0 to quit.");
        System.out.print(">> ");
        inputMenu = scan.nextInt();
              
    } //close while
        
        System.out.println("Thanks for trying!");
      

    } //close main
    
    public static void displayDriverStats(Driver driverToPrint){
        System.out.println("");
        System.out.println("**Driver Stats**");
        System.out.println("Driver Name: " + driverToPrint.name);
        System.out.println("Team: " + driverToPrint.team);
        System.out.println("Fuel Used: " + driverToPrint.getFuelUseInGallons() + " gallons");
        System.out.println("Laps Driven: " + driverToPrint.getLapsDriven() + " laps");
        System.out.println("****************");
    }//close method
    
    public static void displayGasStats(GasTires gasToPrint){
        System.out.println("");
        System.out.println("**Fuel & Tire Stats**");
        System.out.println("Driver Name: " + gasToPrint.driverName);
        System.out.println("Fuel Capacity: " + gasToPrint.tankSize + " gallons");
        System.out.println("Fuel Remaining: " + gasToPrint.gallonsRemaining + " gallons");
        System.out.println("Tires Remaining: " + gasToPrint.tirePercentRemaining + "%");
        System.out.println("*********************");
    }//close method
    
} //close class