/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author JUMA
 */
public class ATM 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n;
        double balance = 5000, withdrawal;
        Scanner input = new Scanner(System.in);
        System.out.println("**********Automatic Tailer Machine*********");
        
        while(true)
        {
            System.out.println("Reply with...");
            System.out.println("1. TO Check balance");
            System.out.println("2. TO Make deposit");
            System.out.println("3. TO Make withdrawal");
            System.out.println("4. Exit!");
            n = input.nextInt();
            
            switch (n) 
            {
            case 1 -> 
            {
                System.out.println("Your balance is " + balance);
            }
            case 2 -> 
            {
                double amount, newBalance;
                System.out.println("Enter amount");
                amount = input.nextDouble();
                newBalance = amount + balance;
                System.out.println("Deposit Successful! /n Your new balance is "+ newBalance);
                        
            }
            case 3 ->
            {
                System.out.println("Enter amount to withdraw ");
                withdrawal = input.nextDouble();
                if(withdrawal < balance)
                {
                    System.out.println("Withdrawal succesful! ");
                }
                else
                {
                    System.out.println("You have Insuficient balance!");
                }
            }
            case 4 ->
            {
               System.exit(0);
            }
            }
        }
    }
}