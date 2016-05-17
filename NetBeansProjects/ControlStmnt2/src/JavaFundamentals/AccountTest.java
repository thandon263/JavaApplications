/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFundamentals;

import java.util.Scanner;
/**
 *
 * @author mthokozisincube
 */
public class AccountTest {
    
    public static void main(String [] args){
    
    
        Account account1 = new Account(50.00);//create Account object
        Account account2 = new Account (-7.53);//create Account object
        
        //display initial balance of each object
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
        
        //create a Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        double depositAmount;//deposit amount read from user
        
        System.out.print("Enter deposit amount for Account1: ");
        depositAmount = input.nextDouble();//obtain user input
        System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount );
        account1.credit(depositAmount);//add to account1 balance
        
        //display balances
        System.out.printf("account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf("account2 balance: $%.2f\n", account2.getBalance() );
        
        System.out.print("Enter deposit amount for account2: ");//prompt
        depositAmount = input.nextDouble();//obtain user input
        System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount );
        account2.credit(depositAmount);//add to account2 balance
    
        //display balances
        System.out.printf("account1 balance: $%.2f\n", account1.getBalance() );
        
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance() );
    
    } //end main  
  
    
}//end class AccountTest
