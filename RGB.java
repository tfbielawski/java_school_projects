/* Class RGB
 * Tom Bielawski
 * 5/22/20
 * Program to convert RGB ints array to doubles array
 */

import java.util.Random;

public class RGB 
{   
    //Constant array of strings to hold color names
    public static String[] colorNames = {"Red", "Green", "Blue"};
    
    //Constant to act as ceiling for random number generator
    public static final int MAX_RGB_INT = 255;
   
    //constant double newArrayOfDoubles to hold converted values from method 2
    static double[] newArrayOfDoubles = new double[3];
    
    //Main
    public static void main(String[] args) 
    {
        //creating a new Random class object
        Random randomRGBs = new Random();
        
        //Create & intitialize an array of integers
        int[] arrayOfInts = new int[3];
        
        //for loop to fill array with random numbers
        for (int i = 0; i < arrayOfInts.length; i++)
        {
            //adds 3 random numbers to the array
            arrayOfInts[i] = randomRGBs.nextInt(MAX_RGB_INT);
           
        }
        //call first method, convertIntsToDoubles(), passing arrayOfInts with 
        //three random values generated above. 
        convertIntsToDoubles(arrayOfInts);
        
        //call second method, displayAllValues() passing arrayOfInts with
        //three random values, and newArrayOfDoubles with new converted values
        displayAllValues(arrayOfInts, newArrayOfDoubles);
    }
    
    //method convertIntsToDoubles() converts three random integers from above
    //to doubles. Returns them in a new array newArrayOfDoubles
    public static double[] convertIntsToDoubles(int newArrayOfInts[])
    {
        for (int i = 0; i < newArrayOfInts.length; i++)
        {
            //convert the array of integers into doubles
            newArrayOfDoubles[i] = newArrayOfInts[i] / (double) MAX_RGB_INT;
        }
        //returning the newArrayOfDoubles to main
        return newArrayOfDoubles;
    }
    
    //method displayAllValues takes the integers from intValues array and 
    //the converted double values in convertedDecimalValues array and
    //displays them.
    public static void displayAllValues(int intValues[], double convertedDecimalValues[])
    {
        //displaying color + integer value + converted double (decimal) value by array element
        System.out.println(colorNames[0] + " " + intValues[0] + " " + convertedDecimalValues[0]);
        System.out.println(colorNames[1] + " " + intValues[1] + " " + convertedDecimalValues[1]);
        System.out.println(colorNames[2] + " " + intValues[2] + " " + convertedDecimalValues[2]);
    }
}
