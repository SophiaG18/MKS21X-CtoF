/*
The functions should take a double for the parameter
The celsiusToFahrenheit should take the celsius temperature
The fahrenheitToCelsius should take the fahrenheit temperature
The functions should also be a double (returns double)
*/

import java.util.Scanner;

public class CtoFTester{
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
    System.out.println(celsiusToFahrenheit(inCelsius));
    System.out.println(fahrenheitToCelsius(inFahrenheit));
  }
  public static double celsiusToFahrenheit(double temp){
    return ((temp * (9.0 / 5.0)) + 32.0);
    // f = (9/5)c + 32
    // formula taken from earlier summer exercises
  }
  public static double fahrenheitToCelsius(double temp){
    return ((temp - 32.0) * (5.0 / 9.0));
    // c = (f - 32) * 5/9
    // reverse the celsius formula to obtain this formula
  }
}
