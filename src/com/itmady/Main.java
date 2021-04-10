package com.itmady;
import java.util.*;



public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Computer has a namber, try to find out it");

        Random rn = new Random();

            int i = rn.nextInt(11);

        Scanner scanner = new Scanner(System.in);

        int n;

        do{

            System.out.println("Please, enter the number from 0 to 10: ");

            int k = scanner.nextInt();

            if (k > i){
                System.out.println("Your number is bigger...");
            }
            else if(k < i){
                System.out.println("Your number is less...");
            }
            n = k;

        }
        while(i!= n);
        System.out.println("You are right!");

    }
}
