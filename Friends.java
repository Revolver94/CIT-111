/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author tom
 */
public class Friends {
 public static void main(String[] print){      
    final int friendsFinal = 300; 
    int friendsScore = 0;
    int response = 0;
    Scanner scan = new Scanner(System.in);
    
//Howdy! Do you like Movies?
System.out.println("Greetings! Let's see if we can be friends!");
System.out.println("Let's begin, here is question 1!");
System.out.println("Do you like movies?");
System.out.println("Type 1 for yes. Type 0 for no");

//Scan input.
response = scan.nextInt();

//If statement to compute friend's score.
if(response == 1){ 
friendsScore = friendsScore + 100;
System.out.println("Awesome! I like movies as well!");
System.out.println("What is your favorite film genre?");
System.out.println("Type 1 for Action.");
System.out.println("Type 2 for Sci Fi.");
System.out.println("Type 3 for Horror.");

//Scan input for question 2.
response = scan.nextInt();

//Nested if statements.
if(response == 1){
friendsScore = friendsScore + 100;    
System.out.println("Action movies are very entertaining.");
} //Close if statement.
else if(response == 2){
System.out.println("Sci Fi movies are my favorite too!");
friendsScore = friendsScore + 200;
} //Close else if statement.
else if(response == 3){
System.out.println("Horror films make me jump!");
friendsScore = friendsScore + 100;
} //Close else if statement.

} //Close if statement.
else{
//Adjust friend's score and display message.    
friendsScore = friendsScore + 0;
System.out.println("That's a bummer because I love movies.");
 

 
 } //Beginning of Question 3.
 System.out.println("Do you like to read books?");
 System.out.println("Type 1 for yes. Type 0 for no");
 
 //Scan input for question 3.
response = scan.nextInt();

//If statement to compute friend's score.
if(response == 1){ 
friendsScore = friendsScore + 100;
System.out.println("Sweet! I like books as well!");
System.out.println("What kind of books do you like?");
System.out.println("Type 1 for Fiction.");
System.out.println("Type 2 for Non Fiction.");

//Scan input for question 4.
response = scan.nextInt();

//Nested if statements.
if(response == 1){
friendsScore = friendsScore + 200;    
System.out.println("Fiction is very exciting!");
} //Close if statement.
else if(response == 2){
System.out.println("Non Fiction is great as well!");
friendsScore = friendsScore + 100;
} //Close else if statement.


} //Close if statement.
else{
//Adjust friend's score and display message.    
friendsScore = friendsScore + 0;
System.out.println("That's a pity because I like books.");
} //Close else statement.

//Determine friend compatability.
if(friendsScore >= friendsFinal){
System.out.println("That's great it looks like we can be friends!");
}
else{
System.out.println("That's a shame we are not a match.");
}
}

 } //Close main.
 






