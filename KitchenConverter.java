//KitchenConverter.java
//Tom Bielawski
//05.14.2020
//Program to convert cups to tablespoons

public class KitchenConverter 
{
    public static void main(String[] args) 
    {
        
        final int TBSP_PER_CUP = 16;
        double cups = 5.5; // user input; allow fractional values
        double tbsp = 0.0;

        tbsp = cups * TBSP_PER_CUP; // convert
        System.out.printf("%.2f cups is %.2f tablespoons\n", cups, tbsp);
    }
}
