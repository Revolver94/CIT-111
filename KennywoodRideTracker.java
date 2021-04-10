/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;
import java.util.Random;

/**
 *
 * @author tom
 */
public class KennywoodRideTracker {
   
  //All member variables contain private static [type] [var name] 
  //and are initialized to zero
  private static int totalRiders = 0;
  private static int totalfailedRiders = 0;
  private static int totalsickRiders = 0;   

    //Constant value names do not change
    final static int THRILL_RIDE_MIN_HEIGHT = 48;
    final static int THEME_RIDE_MIN_HEIGHT = 30;

public static void main(String[] args) { 
System.out.println("Let's try to ride some rides!");
Random rand = new Random();
int riderCount = rand.nextInt(50);
rideBlackWidow (riderCount,75);
printRiderStats();

riderCount = rand.nextInt(50);
rideBlackWidow(riderCount,47);
printRiderStats();

riderCount = rand.nextInt(50);
rideBlackWidow(riderCount,50);
printRiderStats();

riderCount = rand.nextInt(50);
rideMerryGoRound(riderCount,24);
printRiderStats();

riderCount = rand.nextInt(50);
rideMerryGoRound(riderCount,33);
printRiderStats();

}//close main()

public static void rideBlackWidow(int riders, int avgHeight){
//Add incomng riders to member variable tracking the totalRiders
if(avgHeight >= THRILL_RIDE_MIN_HEIGHT){
    System.out.println("Riding the infamous Black Widow!");
    totalRiders = totalRiders + riders;
    Random rand = new Random();
    int numSickRiders = rand.nextInt(riders);
    totalsickRiders = numSickRiders + totalsickRiders;
    return; 
}//close if statement
else{
totalfailedRiders = riders + totalfailedRiders;
System.out.println("Riders are too short to ride the Black Widow!");
System.out.println("Riders turned away: " + totalfailedRiders);
return;
}//close else statement
}//close method

public static void rideMerryGoRound(int riders, int avgHeight){
    //Add incomng riders to member variable tracking the totalRiders
if(avgHeight >= THEME_RIDE_MIN_HEIGHT){
    System.out.println("Riding the docile Merry Go Round!");
    totalRiders = totalRiders + riders;
    Random rand = new Random();
    int numSickRiders = rand.nextInt(riders);
    totalsickRiders = numSickRiders + totalsickRiders;
    return; 
}//close if statement
else{
totalfailedRiders = riders + totalfailedRiders;
System.out.println("Riders are too short to ride the Merry Go Round!");
System.out.println("Riders turned away: " + totalfailedRiders);
return;
}//close else statement
}//close method

public static void printRiderStats(){
System.out.println("Total riders: " + totalRiders);
}//close method

}//close class
        

      
