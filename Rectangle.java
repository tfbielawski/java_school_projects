//Rectangle.java
//May 7 2020
//Tom Bielawski
//A program to compute the area of a rectangle

public class Rectangle
{    
// fields
    private double length;
    private double width;
        
    // main constructor
    public Rectangle() 
    {
        this.length = 0.0;
        this.width = 0.0;
    }
        
    // Overloaded constructor with length/width parameters
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
        
    // Get Area method
    public double getArea() { return length * width; }
    //Get Perimeter method
    public double getPerimeter() { return 2 * length * width; }
        
    // Main method testing the output
    public static void main(String[] args) 
    {          
    //Rectangle 1 object with 0 default values
    Rectangle r1  = new Rectangle(); 
    System.out.printf("The area of r1 is %.2f\n", r1.getArea());
    System.out.printf("The perimeter of r1 is %.2f\n", r1.getPerimeter());
    
    //Wanted to have a blank line for readability.
    System.out.println(" ");
    
    //Rectangle 2 object with defined values       
    Rectangle r2  = new Rectangle(11.0, 143.0);
    System.out.printf("The area of r2 is %.2f\n", r2.getArea());
    System.out.printf("The perimeter of r2 is %.2f\n", r2.getPerimeter());
    }
}  