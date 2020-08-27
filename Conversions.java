// Conversions.java
// Tom Bielawski
// 6/2/20
// Demonstrate various declarations and conversions

public class Conversions
{
    public static void main(String[] args)
    {

        double d = 13.57;

        // 1. cast/convert the above variable to a float variable named f
        float f =  (float)d;

        // cast/convert the variable f, above, to a long variable named l (lower-case L)
        long l = (long)f;

        // cast/convert the variable l, above, to an short variable named s
        short s = (short)l;

        // encode an expression which uses the current value of the variable
        // s to restore the original value of 13.57 to the variable f
        f = (float) (s + 0.47);

        System.out.println("f is now " + f);

        // encode an output statement which uses a ternary conditional operator
        // to compare the variables s and f and prints "f > s" if f is greater 
        // than s, or "s > f" if s is greater than f

        String compare = (f > s) ? "f > s" : "s > f";
        System.out.println(compare);


        // declare and instantiate a SunFlower variable named sf
        SunFlower sf = new SunFlower();

        // declare a Flower reference variable and assign the variable
        // sf as its initial value
        Flower flow = sf;

        // declare a Flower reference variable and instantiate it as a BlackEyedSusan
        Flower flow2 = new BlackEyedSusan();

        // Declare a BlackEyedSusan reference variable and 
        // assign the variable flow2 as its initial value
        BlackEyedSusan bes = (BlackEyedSusan)flow2;
    }
}

class Flower { }

class SunFlower extends Flower { }

class BlackEyedSusan extends SunFlower { }