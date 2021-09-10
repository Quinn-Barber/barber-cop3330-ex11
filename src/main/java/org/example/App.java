package org.example;
import java.text.DecimalFormat;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("###.##");
        double c_to, c_from, rate;
        System.out.println( "How many euros are you exchanging?" );
        Scanner input = new Scanner(System.in);
        c_from = input.nextDouble();
        System.out.println("What is the exchange rate?");
        rate = input.nextDouble();

        c_to = c_from * rate;
        String euros = String.format("%.0f", c_from);
        
        System.out.println(euros + " euros at an exchange rate of " + rate + " is\n" + df.format(c_to) + " U.S. dollars.");
    }
}
