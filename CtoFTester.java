/*
The functions should take a double for the parameter
The celsiusToFahrenheit should take the celsius temperature
The fahrenheitToCelsius should take the fahrenheit temperature
The functions should also be a double (returns double)
*/

import java.util.Scanner;

public class CtoFTester.java{
  public static void main(String[] args){
    double inCelsius;
    double inFahrenheit;
    //these two are the inputs for the functions
    Scanner in = new Scanner(System.in);
    System.out.print("What is the temperature in celsius? ");
    inCelsius = in.nextDouble();
    System.out.print("What is the temperature in fahrenheit? ");
    inFahrenheit = in.nextDouble();
    /*
    wouldn't need to include in codingbat
    but opening in terminal requires some value for variable be coded
    this allows the user to test various values for variables
    */
    celsiusToFahrenheit(inCelsius);
    fahrenheitToCelsius(inFahrenheit);
  }
}
