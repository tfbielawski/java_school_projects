// Tom Bielawski
// Java 1 FSCJ Module 2 Error Correction
// Professor David Singletary
// Date

//Correct errors in Temperature.java
/* Erroneous Code
PUBLIC CLASS Temperature {
        PUBLIC void main(string args) {
        double fahrenheit = 62.5;
        */ /*convert*/ /*
                double celsius = f2c(fahrenheit);
                System.out.println(fahrenheit + 'F' + " = " + Celsius + 'C');
        }
        double f2c(float fahr)
        {
                RETURN (fahr - 32.0) * 5.0 / 9.0;
        }
}*/

//Corrected code
public class Temperature
{
    public static void main(String []args)
        {
            double fahrenheit = 62.5;
            /* convert */
            double celsius = f2c(fahrenheit);
            System.out.println(fahrenheit + "F" + " = " + celsius + 'C');
        }
        static double f2c(double fahr)
        {
            return (fahr - 32.0) * 5.0 / 9.0;
        }
}