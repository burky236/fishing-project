/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author Burak Kaçmaz
 */
public class Week1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char response = 'o';
        int min = 1;
        int max = 6;
        int count = 0; //iteration number
        
        double point = 0; //calculate to total points
        double ave;
        
        System.out.println("Let's go fishing!");
        do {
            //Generate to random number between 1 and 6.
            int random_int = (int) Math.floor(Math.random()*(max-min+1)+min);
            
            if(random_int == 1){                   //if random value equal to 1
                System.out.println("You caught [an old shoe].");
                point = point + 1;
            }
            else if(random_int == 2){              //if random value equal to 2
                System.out.println("You caught [a huge fish].");
                point = point + 100;
            }
            else if(random_int == 3){              //if random value equal to 3
                System.out.println("You caught [a leaf].");
                point = point + 2;
            }
            else if(random_int == 4){              //if random value equal to 4
                System.out.println("You caught [a small fish].");
                point = point + 50;
            }
            else if(random_int == 5){              //if random value equal to 5
                System.out.println("You caught [a rock].");
                point = point + 3;
            }
            else{                                  //if random value equal to 6
                System.out.println("You caught [a garbage].");
                point = point + 0;
            }
            
            System.out.println("Try fishing again? (Y or N):");
            response = (char) input.nextLine().charAt(0);
            count ++;
        } while(response != 'n' && response != 'N'); //stop if we do not want continue
        
        //write total point and iteration number
        System.out.println("You got a total of " +point+ " fishing points.");
        System.out.println("You casted your fishing line " +count+ " times.");
        
        ave = point / count;
        
        System.out.printf("Average =%6.2f" ,ave);
        System.out.println("");   
        
        if(ave >= 20){
            System.out.println("Great Job!");
        }
        else if(ave >= 10 && ave < 20){
            System.out.println("That is some fine fishing.");
        }
        else{
            System.out.println("Try again in future.");
        }
    }   
}
