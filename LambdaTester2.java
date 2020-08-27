// Tom Bielawski
// August 2, 2020
// LambdaTester2
// A program to declare a lambda expression and reference an interface

import java.util.Arrays;
import java.util.List;

interface Multiplier
{
    int multiply(int firstNumber, int secondNumber);
}

class Pair
{
    private final int num1;
    private final int num2;

    public Pair(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getNum1() { return num1; }
    public int getNum2() { return num2; }
}

public class LambdaTester2
{
    public static void main(String[] args)
    {
        Multiplier multiplier = (num1, num2) -> num1 * num2;

        Pair[] pArray = { new Pair(2, 4), new Pair(3, 6), new Pair(4, 7) };

        List<Pair> pairs;
        pairs = Arrays.asList(pArray);
        for (Pair pair : pairs)
        {
            System.out.println("Multiply " + pair.getNum1() + " * " + pair.getNum2() + " = "
                    + multiplier.multiply(pair.getNum1(), pair.getNum2()));
        }
    }
}
