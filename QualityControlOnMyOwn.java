/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Random;

/**
 *
 * @author tom
 */
public class QualityControlOnMyOwn {
    
//Intialize Static Variables
final static int Threshold = 54;
final static int MaxQuality = 78;
final static int Units = 50;
public static void main(String[] args) {

int Quality = 0;
double Failures = 0;
double UnitsMade = 0;

//Create random number generator
Random RandGenerator = new Random();

//Start while loop to see if units pass quality standards
while(UnitsMade < Units){
Quality = RandGenerator.nextInt(MaxQuality);
System.out.println("Unit Quality: " + Quality);
UnitsMade ++;

//Print out pass or failure statement using if
if (Quality < Threshold){
System.out.println("This Unit failed!");
Failures ++;


}else{
System.out.println("This Unit passed!");        
        
}//close if

System.out.println("Failures: " + Failures);
System.out.println("UnitsMade: " + UnitsMade);
System.out.println("--------------------");



}// close while block

//Calculate Quality Statistics
double Stats = (Failures / UnitsMade) * 100;
System.out.println("UnitsMade: " + UnitsMade); 
System.out.println("Failure Rate Percentage: " + Stats);
    
}//close main
}//close class
        
