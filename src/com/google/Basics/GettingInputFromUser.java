package com.google.Basics;

import java.util.Scanner;

public class GettingInputFromUser 
{
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter your name: ");
    	  String name=sc.nextLine();
    	  System.out.println("Enter your age: ");
    	  int age=sc.nextInt();
    	  int elegible_age_int = 18-age;
    	  String elegible_age=Integer.toString(elegible_age_int);  
    	  if(age>=18)
    		  System.out.println("Hi "+name+",you are elegible to vote");
    	  else
    		  
    		  System.out.println("Hi "+name+",come back after "+elegible_age+" years");
      }
}
